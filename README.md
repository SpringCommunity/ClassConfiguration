########Tutorial: CONFIGURE SPRING USING ANNOTATION @CONFIGURATION  ############
########                     Author: Dinh Duc                       ############
########               Coppyright © Spring Community                ############
########Link group : https://www.facebook.com/groups/1811052582478351/ #########

- run mvn archetype:generate to create a new maven project
- run mvn eclipse:eclipse from root location of project to create .project and .classpath to project folder, then import it to eclipse
- Open pom.xml file and copy and paste this under code 
     <dependencies>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context-support</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>3.8.1</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>3.1.0</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>javax.inject</groupId>
			<artifactId>javax.inject</artifactId>
			<version>1</version>
		</dependency>
	</dependencies>
- Update project using maven

     
     
     



