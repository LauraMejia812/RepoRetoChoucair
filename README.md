
Se realizo la certificación de la pagina WordPress en los modulos POST y PAGES con el fin de garantizar las funcionalidades de creación, edición y edición rápida,
WordPress es un sistema de gestión de contenidos lanzado el 27 de mayo de 2003, enfocado a la creación de cualquier tipo de página web. Originalmente alcanzó una gran popularidad en la creación de blogs, para luego convertirse en una de las principales herramientas para la creación de páginas web comerciales.

Se realizará la prueba asignada por la empresa choucair testing, a través del IDE Intellij IDEA implementando el gestor de proyectos Gradle, a continuación, se mencionará cada una de las herramientas implementadas para lograr el objetivo:

Se utilizará como patrón de diseño screenplay porque fomenta buenas prácticas para la escritura de pruebas y además permite dividir por pequeñas secciones el código y con esto tener un ambiente más controlado para la escritura de pruebas, cabe resaltar que al utilizar esta estrategia se mejora la mantenibilidad del código
Se utilizará la herramienta de cucumber como intérprete de lenguaje Gherkin (de negocio) a lenguaje java (Código)
Serenity: Herramienta que nos proporcionará los reportes de los resultados de las pruebas 
Java como lenguaje de programación base para la escritura del código
Navegador en el que se realizó la automatización: Google Chrome versión 85.0.4183.83

Ejecutar Runner específico:

gradlew clean -Dtest.single = "indicar nombre runner" test --info Ejecutar paquete o funcionalidad completa:

gradlew clean test --info