# zilchAppium

1. The tests are stored within the testScripts folder.
2. A setUdid needs to be filled in first before a test can be run on a device. Any other information in the setUp method may need to be modified depending on the device being used.
3. A simple POM is set-up where elements and methods relating to the same page are grouped together.
4. A simple test is created to check certain buttons are present and the prerequesite to have the test pass is:
   - The Zilch app needs to be opened up first
   - The appium server needs to be up and running
   - The device needs to be connected to the machine and USB debugging needs to be enabled.
6. The command to run the test is: mvn test
