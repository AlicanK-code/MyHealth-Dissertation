
Health Application for Appointment Management

Author: Alican Kaplan - BSc Computer Science With Placement

This is a university dissertation project

This is a desktop application that allows users to book and cancel appointments and portray helpful information
to users regarding different services within a healthcare trust. This is created with Java, and built with the Maven Archetype Framework

Front-end: Maven Archetype Framework JavaFX, CSS
Back-end: MySQL, Java, JBDC Connectivity, Apache Maven

Application features:

Booking and Cancelling appointments via a Calender popup implementation, and a drop-down section for time. 
Appointment details are saved within the database. A section on information for different services within
healthcare trusts where users can look for additional information if they wish to contact services or look for
specific information.

Prerequisites for the project:

Without the following, the application will not run as intended:

	1.  Visual Studio Code and its extensions:
	1a. Extension Pack for Java
	1b. Maven for Java
	1c. Debugger for Java
	1d. Language Support for Java(TM) by Red Hat
	1e. JavaFX Support
	1f. Project Manager for Java

	2. MySQL and MySQL Workbench
	
	3. Java JDK 11+ (must be atleast version 11)

	4. Apache Maven

Please view the "Additional Step-By-Step Guide" if you need any assistance on installation


Testing the application:

1. Extract the zip file to a location on your device.
2. Make sure you open the code onto Visual Studio Code
3. Allow Visual Studio Code to build and download everything the project needs. You may be prompted with a popup asking to
download any additional requirements, please allow. This may take some time.
4. Make sure to install MySQL and MySQL Workbench --> https://dev.mysql.com/downloads/mysql/ (please scroll down if you need any assistance on setting this up)
5. During installation for MySQL please ensure you download the full package. You will also be asked to create a password, make sure to remember the password you have
created as this will be needed in the later stages.
6. Once Visual Studio Code and MySQL Workbench has been setup, please go to the following: > src\main > java > com\example > PrimaryController.java at approximately
line 27 you will see, " private static final String DB_PASSWORD = "MYSQLpassword"; // Replace with your password ". Change the password to the password you created for MySQL.
7. Now go back to MySQL Workbench, click on your local instance and enter your password.
8. Change back to Visual Studio Code and go to: > src\main > java > com\example > App.java and click the play button in the top-right of your screen.
9. Once everything is running, you should have an application running called "MyHealth" which is the application created for this project and will be on a homepage
"Healthcare Services" with two buttons "Book Appointments" and "Information".

Project Folder Structure:

All of the classes and additional files for this project, the backend and frontend.

src\main > java > com\example > App.java - This class contains the necessary code to run the application and implementation of the styles.css file
src\main > java > com\example > HomeController.java - This class contains code allowing the user to alternate between screens (booking and information)
src\main > java > com\example > InformationController.java - This class contains code allowing the user to alternate to the home page whilst on the informations page
src\main > java > com\example > PrimaryController.java - This class contains code allowing the user to perform booking/cancelling appointment functions. Also contains code for MySQL
src\main > java > com\example > module-info.java - This class contains code which has defined dependencies that were used within the project and other classes. (JavaFX and SQL)
src\main > resources\com\example > homepage.fxml - The FXML files contain code used to build the graphical user-interface and contain information to populate the pages.
src\main > resources\com\example > information.fxml
src\main > resources\com\example > primary.fxml
src\main > resources\com\example > styles.css - The design of the application
src\main > resources\com\example > myHealthLogo.png - The application's logo.
pom.xml - Fundamental file created in Maven defining the project's dependencies and configuration for building the project.

----------------------------------------------------

Additional Step-By-Step Guide: How to install this project from scratch

----------------------------------------------------

1. Visual Studio Code:

Firstly, you are going to want to install the IDE used within this project: Visual Studio Code
Visit the following link to do so: https://code.visualstudio.com/ 
You will then see a blue box which says "Download for Windows" Once you have pressed on this box, you will see a download beginning in your downloads folder.
You will then click on the executable file, and begin installing Visual Studio Code. Make sure to install this with the default settings.

2. Extensions within Visual Studio Code:

Now that you have Visual Studio Code installed on your system, you will need to add the following extensions within your Visual Studio Code IDE:


	1. To install these extensions, open Visual Studio Code
	
	2. On the left hand side you can see 4 icons, the icon at the bottom with squares are where you can find the installed extensions as well as search for extensions.

	3. Enter the aforementioned extensions in the search bar and install.
	
	4. Please restart Visual Studio Code after installing these extensions to make sure they are installed.

	Note: Some of these extensions may already be installed along with the Extension Pack for Java.

	If you have any issues follow this website for some guidance:  https://code.visualstudio.com/docs/java/java-gui 



3. Installing JDK for Java:

Firstly, you are going to need to install atleast JDK 11 to run this project on your system.

	1. Install the JDK software

	1a. Visit the following website: http://java.sun.com/javase/downloads/index.jsp

	1b. Select the appropriate JDK for this project (atleast JDK 11), using the latest version will also work. Remember this is for a Windows build so you will need to select that option.

	1c. Once you have downloaded the correct JDK file, you will now need to execute this and let it complete.

2. Now the JDK software is installed on your system. For example, at C:\Program Files\Java\jdk1.6.0_02. You may wish to move the JDK to another location if you want to.

3. Now you need to set JAVA_HOME

	3a. Right Click "THIS PC" in the search bar of your desktop and click on "Properties". There may be an Advanced System Settings or you will directly be sent to System Properties.
	
	3b. On the "Advanced Tab" within the System Properties popup, select "Environment Variables". 
	
	3c. Either Edit or Add JAVA_HOME to your System Variables so that it points to where the JDK software is located. For example: C:\Program Files\Java\jdk1.6.0_02.

4. Please restart your Visual Studio Code after you have completed this step.


4. Installing MySQL Database to connect with JDBC:

	1. Visit the following website: https://dev.mysql.com/downloads/mysql/

	2. Select the latest version and download the relevant Windows Installer (Windows (x86, 64-bit), MSI Installer). 

	3. When you are on MySQL Installer SELECT the following products:
	
	3a. MySQL Server, Workbench, Shell, Router and the Connector for Java (the connector may be under the Router layer)

	4. Once these are installed, you will be prompted with an Account and Roles page

	4a. Type in a MySQL Root Password and Repeat Password (in this project the password I assigned was 'MYSQLpassword' but you are free to change this. If you do change this, you will need to edit the information in the PrimaryController.java class within the application).
	
	5. You then continue with the installation and once you are finished your MySQL Database/Workbench should be working.

	6. You will need to enter the password you set each time you try to access the database.

5. Installing Apache Maven

	You may need to install Apache Maven for this project, just incase this is how:

	1. Go to this website: https://maven.apache.org/download.cgi
	
	2. Download the 'Binary Zip archive'

	3. You can either move the file to your Program files and Extract there or wherever you choose to extract.

	4. Go to your Windows Home bar and type in 'Environment', you will see 'Edit the system environment variables' click it

	5. You will be at the System Properties popup as before, click on Environment Variables.

	5a. Under System Variables, locate the Path variable and click edit.

	5b. Get the path of the apache-maven extracted file and click New into the System Variables and enter the path.
	
	5c. Make sure it ends with \bin and if there is a pre-existing apache-maven directory, make sure the one you added is above the previous one.

	6. Go to your windows terminal and type ' mvn --version ' to see if this was done successfully, you should have an Apache Version visible.



6. Once you have downloaded the project from Moodle, please extract it from the zip and open it via Visual Studio Code.



