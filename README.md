# projetWeb
# Back-end
Pour le back-end on a utilisé : Java, Maven, Spring boot, MySQL, JPA et Hibernate
En se basant sur la documentation dans ce lien https://spring.io/guides/gs/accessing-data-mysql/ on a créé le back-end de notre blog.
MySQL version 5.6+
JDK 1.8+
Maven 3.0+
Pour lancer le projet, il faut suivre les étapes suivantes
1. Importer le projet dans votre IDE(on a travaillé avec IntelliJ)
git clone https://github.com/LuzTn/projetWeb.git
2. Création de la base de données : 
mysql> create database db_example; -- Create the new database

3. Modifier le fichier src/main/resources/application.properties selon les paramètres de votre base de données:
spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:mysql://localhost:3306/db_example
spring.datasource.username=DBuser //votre nom d'utilisateur de la base de données
spring.datasource.password=ThePassword //le mot de passe de la base de données
