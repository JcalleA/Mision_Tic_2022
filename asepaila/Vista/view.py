from struct import pack
from tkinter import *
from tkinter import ttk


ventana = Tk()
ventana.config(bd=50)
ventana.title("Aseo acuavalle")

buton1=ttk.Button(text="Aseo acuavalle")
buton1.pack()

label1=ttk.Label(text="Hola")
label1.pack()

menu=Menu(ventana)
editmenu = Menu(menu)
filemenu = Menu(menu)

ventana.config(menu=menu)

filemenu = Menu(menu, tearoff=0)
filemenu.add_command(label="Nuevo")
filemenu.add_command(label="Abrir")
filemenu.add_command(label="Guardar")
filemenu.add_command(label="Cerrar")
filemenu.add_separator()
filemenu.add_command(label="Salir", command=ventana.quit)
menu.add_cascade(label="Archivo", menu=filemenu)
menu.add_cascade(label="Editar", menu=editmenu)








ventana.mainloop()