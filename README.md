Azurian Back

🚀 Inicialización del Proyecto
Sigue estos pasos para configurar y ejecutar el proyecto localmente.

Prerrequisitos
Asegúrate de tener instalados los siguientes requisitos en tu sistema:

Java JDK (17)
IntelliJ IDEA (opcional, pero recomendado)
Maven


Instalación
Clonar el repositorio:


https://github.com/JasonGTAP/azurian-back.git



Importar el proyecto en IntelliJ IDEA:
Abre IntelliJ IDEA.
Selecciona "Open" en el menú principal y navega hasta la carpeta donde clonaste el repositorio.
Selecciona el archivo pom.xml y haz clic en "Open".


Configuración de la Base de Datos:
Asegúrate de tener una base de datos configurada. configurar base de datos compatible (MySQL)
Actualiza las propiedades de configuración de la base de datos en el archivo application.properties o application.yml según tus necesidades.



Ejecución del Proyecto:
Abre una terminal en IntelliJ IDEA o utiliza la terminal de tu sistema.
Ejecuta el siguiente comando para construir y ejecutar el proyecto:

mvn spring-boot:run

mvn spring-boot:test

Acceder a la Aplicación:
Una vez que la aplicación se haya iniciado correctamente, puedes acceder a ella en tu navegador web mediante la URL (http://localhost:8080/Azurian-app/v1/productos)
