public class newLogin {
    public String pass = "";
    public String user = "";
    public WordGen newGen;
    public newLogin(WordGen newGen) {
        this.newGen = newGen;
        pass = newGen.newPass();
        user = newGen.newUser();
    }
    public String getPass() {
        return pass;
    }
    public String getUser() {
        return user;
    }
}
