import Utilidades.conexion



def Consultar_Usuario(Nombre):
    conn=Utilidades.conexion.create_connection(r'C:/Users/Calle1413/agua.db')
    cursor = conn.cursor()
    instruction="SELECT * FROM Cliente WHERE Nombre  LIKE '"+Nombre+"%'"
    cursor.execute(instruction)
    datos=cursor.fetchall()
    conn.commit()
    conn.close()
    print(datos)
    
def Insertar_Medicion(Contador,Responsable,Lectura,Fecha):
    conn=Utilidades.conexion.create_connection(r'C:/Users/Calle1413/agua.db')
    cursor = conn.cursor()
    instruction="INSERT INTO consumos  (ID_Contador,ID_Empleado, Lectura, Mes, Dia, Año)VALUES ("+Contador,Responsable,Lectura,Fecha+");"
    cursor.execute(instruction)
    datos=cursor.fetchall()
    conn.commit()
    conn.close()
    print(datos)
    
Insertar_Medicion(1,1,800,'2022,08,05')