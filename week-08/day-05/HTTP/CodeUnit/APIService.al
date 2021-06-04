codeunit 50100 APIService
{
    procedure GetAllPosts()
    var
        Client: HttpClient;
        Response: HttpResponseMessage;
        JObject: JsonObject;
        JToken: JsonToken;
        JText: Text;
        JArray: JsonArray;
        Url: Text;
        UserRecord: Record Post;
        MessageText: Text;
    begin
        Url := 'https://jsonplaceholder.typicode.com/posts';
        if Client.Get(Url, Response) then begin
            Response.Content.ReadAs(JText);
            JArray.ReadFrom(JText);

            // JArray := JObject.AsToken().AsArray();

            foreach JToken in JArray do begin
                JObject := JToken.AsObject();
                UserRecord.Id := GetToken(JObject, 'id').AsValue().AsInteger();
                UserRecord.UserId := GetToken(JObject, 'userId').AsValue().AsInteger();
                UserRecord.Title := GetToken(JObject, 'title').AsValue().AsText();
                UserRecord.Body := GetToken(JObject, 'body').AsValue().AsText();
                UserRecord.Insert();

            end;
        end;
    end;

    local procedure GetToken(JObject: JsonObject;
     TokenKey: Text) Token: JsonToken
    var
        Success: Boolean;
    begin
        Success := JObject.Get(TokenKey, Token);
        if not Success then begin
            Error('Error message');

        end;

    end;
}