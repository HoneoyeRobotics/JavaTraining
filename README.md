# JavaTraining #
FRC Java Training

This repository is where our training files for Java are located. You can follow our guide listed above - Building a Command Robot in Java.pdf. You can find the example project from this documentation under the Examples folder.

The PowerPoint from the Java presenation on basics of FRC programming is listed above as well - 018 FRC Java Presentation.pdf

If you want more information on Java, you can search youtube for basics videos. One example is: https://www.youtube.com/watch?v=uWYPVz_i7W4


We recommend setting the root of the repository up under C:\SuitsGIT\ so all of the mappings are correct. This project would then be mapped to C:\SuitsGIT\JavaTraining. This structure is required for LabView projects CTRE references.

Use the GitHub desktop app to setup your folder structure.

To get an environment up and running, we recommend following these steps:

## Software ##
You need to download a few things before you get started. Some packages are online packages, which make things easier.
First, download a Ninite installer package. Go to https://ninite.com/
Select the following out of the list
* Developer Tools
	* Notepad++
	* JDK 8 x64
	* JDK 8
	* Visual Studio Code
* Runtimes
	* Java 8 Runtime
	* Silverlight
* Documents
	* Foxit Reader (Good PDF reader)

Click Get your Ninite when you are down. The file name should have all of the apps that you are installing.
Go download github desktop at https://desktop.github.com/

Download the latest GIT client: https://git-scm.com/downloads

Next get the WPILib VS Code extension. The current release is https://github.com/wpilibsuite/vscode-wpilib/releases/tag/v2019.0.0-alpha-4

CTRE Phoenix Framework
http://www.ctr-electronics.com/talon-srx.html#product_tabs_technical_resources

Any FRC Update Suites. Currently there is 2018 Update 1.
https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/599670-installing-the-frc-update-suite-all-languages



## Install Order ##
1.	Install Ninite package
2.  Install GIT package
2.	Reboot your computer
3.	Configure Visual Studio Code environment - https://wpilib.screenstepslive.com/s/currentCS/m/79833/l/932382-installing-vs-code
4.	Install WPILib Visual Studio Extension
5.	(OPTIONAL) Install Cross the Road Electronics Package

You may have issues loading Java because JAVA_HOME is not set. You can set it and then reboot for it to take effect. To do this, open a command prompt as administrator on your computer and follow these commands:
> C:\>cd "Program Files"
> 
> C:\Program Files>cd Java
> 
> C:\Program Files\Java>dir
>  Volume in drive C has no label.
>  Volume Serial Number is 1E7A-70B8
> 
>  Directory of C:\Program Files\Java
> 
> 07/02/2018  02:35 PM    <DIR>          .
> 07/02/2018  02:35 PM    <DIR>          ..
> 07/02/2018  02:36 PM    <DIR>          jdk1.8.0_172
> 05/15/2017  01:46 PM    <DIR>          jre1.8.0_131
> 07/02/2018  02:36 PM    <DIR>          jre1.8.0_172
>                0 File(s)              0 bytes
>                5 Dir(s)  54,882,783,232 bytes free
> 
> C:\Program Files\Java>setx JAVA_HOME "C:\Program Files\Java\jdk1.8.0_172"
> 
> SUCCESS: Specified value was saved.
> 
> C:\Program Files\Java>



For 2018, if you want the drivers station, you have to install the FRC Update suite.
If you want labview as well, download and install labview before the FRC update suite.


