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

 # PARTE C

  **Preguntas**

  
1. ¿Qué guarda una variable int y qué guarda una variable Libro?

	Una variable int guarda un Número Entero que va directamente a un espacio específico en la memoria, la variable Libro guarda una referencia a un objeto


2. ¿Por qué prestar con l2 cambió l1 pero no l3?

   Al prestarse con l2 cambió l1 fue porque fue directamente instaciada como un alias, es decir, se guardó en el mismo lugar de memoria en que se guardó l1. Por el contrario l3 fue guardado en otro diferente.

   
3. ¿Por qué el compilador no detectó la NullPointerException?

   Ésto sucedió porque se evitó el error directamente con condicionales if y else.

   
4. ¿Qué diferencia hay entre modificar el objeto que recibe un método y asignarle uno nuevo a su parámetro?

   Al modificar un objeto que recibe un método éste se altera y el cambio se refleja

   
5. ¿Qué invariantes protege Libro y cómo las protege?

   Asegura un libro que no tenga título vacío y los protege con encapsulamientos.

