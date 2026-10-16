# POO_taller_6

**ETAPA 1**

4. Comenta el import, ejecuta y anota el error. Vuelve a activarlo.

  Exception in thread "main" java.lang.RuntimeException: Uncompilable code - cannot find symbol

  
  symbol:   class Libro

  
  location: class Biblioteca.app.main

  
	at Biblioteca.app.main.main(main.java:1)
  C:\Users\User\AppData\Local\NetBeans\Cache\31\executor-snippets\run.xml:111: The following error occurred while executing this line:


  C:\Users\User\AppData\Local\NetBeans\Cache\31\executor-snippets\run.xml:68: Java returned: 1


  BUILD FAILED (total time: 6 seconds)

  Ésto sucede debido a que el import en el main se comporta como la parte lógica que conecta ambos paquetes de un mismo proyecto, sin él, no se podrían enlazar las acciones de los métodos junto a la instanciación de los objetos

  **Etapa 3**

  Error:

  Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Biblioteca.modelo.Libro.mostrarInformacion()" because "libro14" is null
	at Biblioteca.app.main.main(main.java:31)

  
  C:\Users\User\AppData\Local\NetBeans\Cache\31\executor-snippets\run.xml:111: The following error occurred while executing this line:


  C:\Users\User\AppData\Local\NetBeans\Cache\31\executor-snippets\run.xml:68: Java returned: 1


  BUILD FAILED (total time: 0 seconds)

  Ésto ocurre pues debido a que no se instanció el objeto Libro14.


  **Etapa 4**

  Error:
  
  titulo has private access in biblioteca.modelo.Libro
  

  Éste error aparece porque el atributo titulo tiene acceso privado por lo que no se puede acceder a él sin utilizar Getters y Setters.


  
