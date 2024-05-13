package Singleton;
// gives only one instance no matter what
 class Singleton {

     public static void main(String[] args) {
         DbConnection.getConnection();
     }
}
class DbConnection {
     private DbConnection(){

     }
     static DbConnection dbConnection;

     public static DbConnection getConnection(){
        if(dbConnection == null) return new DbConnection();
        return dbConnection;
     }
}
