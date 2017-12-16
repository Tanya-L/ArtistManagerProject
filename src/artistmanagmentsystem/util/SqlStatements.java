package artistmanagmentsystem.util;

public class SqlStatements {
    
    public final static String ADD_STATMENT = "INSERT into artist (name,last_name,age) values(?,?,?)";
    public final static String DELETE_STATMENT = "DELETE from artist where id = ?;";
    public final static String UPDATE_NAME_STATMENT = "UPDATE artist SET name = ? WHERE id = ?;";
    public final static String UPDATE_LAST_NAME_STATMENT = "UPDATE artist SET last_name = ? WHERE id = ?;";
    public final static String UPDATE_AGE_STATMENT = "UPDATE artist SET age = ? WHERE id = ?;";
    public final static String SHOW_ALL_STATMENT = "SELECT name, last_name, age from artist;";
    public final static String FIND_BY_ID_STATMENT = "SELECT id,name, last_name, age from artist where id = ?;";
    public final static String FIND_BY_NAME_STATMENT = "SELECT id,name, last_name, age from artist where name = ?;";
    public final static String FIND_BY_AGE_STATMENT = "SELECT id,name, last_name, age from artist where age = ?;";
        
}
