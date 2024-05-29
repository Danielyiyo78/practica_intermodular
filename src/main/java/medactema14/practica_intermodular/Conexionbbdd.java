/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medactema14.practica_intermodular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexionbbdd{
// Configuración de la conexión a la base de datos MySQL
String url = "jdbc:mysql://localhost:3306/practica_intermodular";
String usuario = "root";
String contraseña = "Med@c";
// Sentencias SQL
String sqlMarte = "SELECT * FROM planeta where nombre='Marte'";
String sqlVenus = "SELECT * FROM planeta where nombre='Venus'";
String sqlTierra = "SELECT * FROM planeta where nombre='Tierra'";
String sqlMercurio = "SELECT * FROM planeta where nombre='Mercurio'";
String sqlSaturno = "SELECT * FROM planeta where nombre='Saturno'";
String sqlUrano = "SELECT * FROM planeta where nombre='Urano'";
String sqlNeptuno = "SELECT * FROM planeta where nombre='Neptuno'";
String sqlJupiter = "SELECT * FROM planeta where nombre='Jupiter'";

//metodos de conectar y consultar
public String[] conectarConsultarMarte(){
 String[] datosMarte = new String[8];
 
 try{
 //conectarme
 Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
// Crear una instancia de Statement para ejecutar la sentencia SQL
Statement statement = conexion.createStatement();
//lanzar query
ResultSet resultados = statement.executeQuery(sqlMarte);
//recoger datos y guardar en array
while (resultados.next()) {
// Obtener los valores de las columnas
datosMarte[0] = resultados.getString("radio");
datosMarte[1] = resultados.getString("distanciaMedia");
datosMarte[2]= resultados.getString("dias");
datosMarte[3] = resultados.getString("temperatura");
datosMarte[4]= resultados.getString("tipoPlaneta");
datosMarte[5]= resultados.getString("numeroSatelite");
datosMarte[6]= resultados.getString("fechacreacion");
datosMarte[7]= resultados.getString("numeroSatelite");
//cerrar conecsion
resultados.close();
conexion.close();
statement.close();
}
 }catch (SQLException e) {
e.printStackTrace();
}
 return datosMarte;

}



public String[] conectarConsultarVenus(){
 String[] datosVenus = new String[8];
 
 try{
 //conectarme
 Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
// Crear una instancia de Statement para ejecutar la sentencia SQL
Statement statement = conexion.createStatement();
//lanzar query
ResultSet resultados = statement.executeQuery(sqlVenus);
//recoger datos y guardar en array
while (resultados.next()) {
// Obtener los valores de las columnas
datosVenus[0] = resultados.getString("radio");
datosVenus[1] = resultados.getString("distanciaMedia");
datosVenus[2]= resultados.getString("dias");
datosVenus[3] = resultados.getString("temperatura");
datosVenus[4]= resultados.getString("tipoPlaneta");
datosVenus[5]= resultados.getString("numeroSatelite");
datosVenus[6]= resultados.getString("fechacreacion");
datosVenus[7]= resultados.getString("numeroSatelite");
//cerrar conecsion
resultados.close();
conexion.close();
statement.close();
}
 }catch (SQLException e) {
e.printStackTrace();
}
 return datosVenus;

}

public String[] conectarConsultarTierra(){
 String[] datosTierra = new String[8];
 
 try{
 //conectarme
 Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
// Crear una instancia de Statement para ejecutar la sentencia SQL
Statement statement = conexion.createStatement();
//lanzar query
ResultSet resultados = statement.executeQuery(sqlTierra);
//recoger datos y guardar en array
while (resultados.next()) {
// Obtener los valores de las columnas
datosTierra[0] = resultados.getString("radio");
datosTierra[1] = resultados.getString("distanciaMedia");
datosTierra[2]= resultados.getString("dias");
datosTierra[3] = resultados.getString("temperatura");
datosTierra[4]= resultados.getString("tipoPlaneta");
datosTierra[5]= resultados.getString("numeroSatelite");
datosTierra[6]= resultados.getString("fechacreacion");
datosTierra[7]= resultados.getString("numeroSatelite");
//cerrar conecsion
resultados.close();
conexion.close();
statement.close();
}
 }catch (SQLException e) {
e.printStackTrace();
}
 return datosTierra;

}
public String[] conectarConsultarMercurio(){
 String[] datosMercurio = new String[8];
 
 try{
 //conectarme
 Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
// Crear una instancia de Statement para ejecutar la sentencia SQL
Statement statement = conexion.createStatement();
//lanzar query
ResultSet resultados = statement.executeQuery(sqlMercurio);
//recoger datos y guardar en array
while (resultados.next()) {
// Obtener los valores de las columnas
datosMercurio[0] = resultados.getString("radio");
datosMercurio[1] = resultados.getString("distanciaMedia");
datosMercurio[2]= resultados.getString("dias");
datosMercurio[3] = resultados.getString("temperatura");
datosMercurio[4]= resultados.getString("tipoPlaneta");
datosMercurio[5]= resultados.getString("numeroSatelite");
datosMercurio[6]= resultados.getString("fechacreacion");
datosMercurio[7]= resultados.getString("numeroSatelite");
//cerrar conecsion
resultados.close();
conexion.close();
statement.close();
}
 }catch (SQLException e) {
e.printStackTrace();
}
 return datosMercurio;

}

public String[] conectarConsultarSaturno(){
 String[] datosSaturno = new String[8];
 
 try{
 //conectarme
 Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
// Crear una instancia de Statement para ejecutar la sentencia SQL
Statement statement = conexion.createStatement();
//lanzar query
ResultSet resultados = statement.executeQuery(sqlSaturno);
//recoger datos y guardar en array
while (resultados.next()) {
// Obtener los valores de las columnas
datosSaturno[0] = resultados.getString("radio");
datosSaturno[1] = resultados.getString("distanciaMedia");
datosSaturno[2]= resultados.getString("dias");
datosSaturno[3] = resultados.getString("temperatura");
datosSaturno[4]= resultados.getString("tipoPlaneta");
datosSaturno[5]= resultados.getString("numeroSatelite");
datosSaturno[6]= resultados.getString("fechacreacion");
datosSaturno[7]= resultados.getString("numeroSatelite");
//cerrar conecsion
resultados.close();
conexion.close();
statement.close();
}
 }catch (SQLException e) {
e.printStackTrace();
}
 return datosSaturno;

}


public String[] conectarConsultarUrano(){
 String[] datosUrano = new String[8];
 
 try{
 //conectarme
 Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
// Crear una instancia de Statement para ejecutar la sentencia SQL
Statement statement = conexion.createStatement();
//lanzar query
ResultSet resultados = statement.executeQuery(sqlUrano);
//recoger datos y guardar en array
while (resultados.next()) {
// Obtener los valores de las columnas
datosUrano[0] = resultados.getString("radio");
datosUrano[1] = resultados.getString("distanciaMedia");
datosUrano[2]= resultados.getString("dias");
datosUrano[3] = resultados.getString("temperatura");
datosUrano[4]= resultados.getString("tipoPlaneta");
datosUrano[5]= resultados.getString("numeroSatelite");
datosUrano[6]= resultados.getString("fechacreacion");
datosUrano[7]= resultados.getString("numeroSatelite");
//cerrar conecsion
resultados.close();
conexion.close();
statement.close();
}
 }catch (SQLException e) {
e.printStackTrace();
}
 return datosUrano;

}

public String[] conectarConsultarNeptuno(){
 String[] datosNeptuno = new String[8];
 
 try{
 //conectarme
 Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
// Crear una instancia de Statement para ejecutar la sentencia SQL
Statement statement = conexion.createStatement();
//lanzar query
ResultSet resultados = statement.executeQuery(sqlNeptuno);
//recoger datos y guardar en array
while (resultados.next()) {
// Obtener los valores de las columnas
datosNeptuno[0] = resultados.getString("radio");
datosNeptuno[1] = resultados.getString("distanciaMedia");
datosNeptuno[2]= resultados.getString("dias");
datosNeptuno[3] = resultados.getString("temperatura");
datosNeptuno[4]= resultados.getString("tipoPlaneta");
datosNeptuno[5]= resultados.getString("numeroSatelite");
datosNeptuno[6]= resultados.getString("fechacreacion");
datosNeptuno[7]= resultados.getString("numeroSatelite");
//cerrar conecsion
resultados.close();
conexion.close();
statement.close();
}
 }catch (SQLException e) {
e.printStackTrace();
}
 return datosNeptuno;

}

public String[] conectarConsultarJupiter(){
 String[] datosJupiter = new String[8];
 
 try{
 //conectarme
 Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
// Crear una instancia de Statement para ejecutar la sentencia SQL
Statement statement = conexion.createStatement();
//lanzar query
ResultSet resultados = statement.executeQuery(sqlJupiter);
//recoger datos y guardar en array
while (resultados.next()) {
// Obtener los valores de las columnas
datosJupiter[0] = resultados.getString("radio");
datosJupiter[1] = resultados.getString("distanciaMedia");
datosJupiter[2]= resultados.getString("dias");
datosJupiter[3] = resultados.getString("temperatura");
datosJupiter[4]= resultados.getString("tipoPlaneta");
datosJupiter[5]= resultados.getString("numeroSatelite");
datosJupiter[6]= resultados.getString("fechacreacion");
datosJupiter[7]= resultados.getString("numeroSatelite");
//cerrar conecsion
resultados.close();
conexion.close();
statement.close();
}
 }catch (SQLException e) {
e.printStackTrace();
}
 return datosJupiter;

}
}
