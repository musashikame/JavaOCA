package oca.basics;

//normal imports
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;

//redundant imports (uncomment to show errors)
//import java.util.Date;
//import java.sql.Date;

//This two are redundant imports
//import java.util.*;
//import java.sql.*;

public class Imports {

    public static void main(String ar[]) throws Exception {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        java.sql.Date dateSQL = new java.sql.Date(df.parse("02-04-2015").getTime());
    }
}
