/** 
 *  File : DAOManager.java 31/05/2023
 *  Nama : Abyan Izzah / 24060121130082
 *  Deskripisi : Pengelola DAO dalam program
**/

public class DAOManager {
    private PersonDAO PersonDAO;

    public void setPersonDAO(PersonDAO person){
        PersonDAO = person;

    }

    public PersonDAO getPersonDAO(){
        return PersonDAO;
    }
    
}
