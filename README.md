# zilchAppium

1. The tests are stored within the testScripts folder.
2. A setUdid needs to be filled in first before a test can be run on a device. Any other information in the setUp method may need to be modified depending on the device being used.
3. A simple POM is set-up where elements and methods relating to the same page are grouped together.
4. A simple test is created to check certain buttons are present and the prerequesite to have the test pass is the Zilch app needs to be opened up first and the appium server needs to be up and running along with the device being connected to the machine the test is running on.
5. the command mvn test will run the test.