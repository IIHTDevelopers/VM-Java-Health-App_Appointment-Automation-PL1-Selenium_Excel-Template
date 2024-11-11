package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class appointment_Pages extends StartupPage {
	
	//Locators of L1 Scenarios
	//login locators
	By usernameTextfield = By.id(" ");
	By usernameTextbox = By.xpath(" ");
	By passwordTextbox = By.xpath(" ");
	By signInButton = By.xpath(" ");
	By registeredPatientTextElement = By.xpath(" ");

	//Appoint Module's locators 
	By appointmentModuleByElement = By.xpath(" ");
	By appointmentModuleToggleByElement = By.xpath(" ");
	By selectCounterTitleNameByElement = By.xpath(" ");

	By selectCounterNewOneLinkByElement = By.xpath(" ");
	By newPatientButtonLinkByElement = By.xpath(" ");
	By patientInformationTextByElement = By.xpath(" ");
	By careOfPersonContactTextboxByElement = By.xpath(" ");
	By careOfPersonTextboxByElement = By.xpath(" ");
	By printInvoiceButtonByElement = By.xpath(" ");
	By confirmButtonByElement = By.xpath(" ");
	By errorMessageOfLastNameTextboxByElement = By.xpath(" ");

	By firstNameTextboxByElement = By.xpath(" ");
	By middleNameTextboxByElement = By.xpath(" ");
	By lastNameTextboxByElement = By.xpath(" ");
	By ageTextboxByElement = By.xpath(" ");
	By phoneTextboxByElement = By.xpath(" ");

	By havDOBCheckboxByElement = By.xpath(" ");
	By dobDatePickerByElement = By.xpath(" ");

	By externalCheckBoxByElement = By.xpath(" ");
	By plusIconClickToAddExternalReffererByElement = By.xpath(" ");
	By addExternalReferralTitleByElement = By.xpath(" ");
	By referrerNameTexboxByElement = By.xpath(" ");
	By extRefferAddressTextFieldElement = By.xpath(" ");
	By contactNumberTextFieldElement = By.xpath(" ");
	By emailTextFieldElement = By.xpath(" ");
	By isIncentiveApplicableCheckboxElement = By.xpath(" ");
	By addreferrerButtonByElement = By.xpath(" ");
	By successNotificationPopupMessageElement = By.xpath(" ");
	By successNotificationPopupMessageOneElement = By.xpath(" ");
	By successNotificationPopupMessageTwoElement = By.xpath(" ");

	By relationWithPatientDropdownByElement = By.xpath(" ");

	By bookAppointmentSubModuleByElement = By.xpath(" ");
	By newPatientButtonByElement = By.xpath(" ");

	By monthRadioButtonByElement = By.xpath(" ");
	By daysRadioButtonByElement = By.xpath(" ");

	By firstNameTexboxOfBookAppointmentByElement = By.xpath(" ");
	By middleNameTexboxOfBookAppointmentByElement = By.xpath(" ");
	By lastNameTexboxOfBookAppointmentByElement = By.xpath(" ");
	By genderMaleOptionOfBookAppointmentByElement = By.xpath(" ");
	By addAppointmentButtonByElement = By.xpath(" ");

	By errorNotificationPopupMessageElement = By.xpath(" ");
	By statusErrorNotificationMessageByElement = By.xpath(" ");
	By mainErrorNotificationMessageByElement = By.xpath(" ");

	By procurementModule = By.xpath(" ");
	By settingsTab = By.xpath(" ");
	By subCategoryTabByElement = By.xpath(" ");
	By cuttonSubCategoryNameByElement = By.xpath(" ");

	By vaccinationModuleByElement = By.xpath(" ");
	By vaccinationModulesToggleIconByElement = By.xpath(" ");
	By patientListSubModuleByElement = By.xpath(" ");
	By titleNameOfVaccinationPatientRegisterFormByElement = By.xpath(" ");
	By newVaccinationPatientButtonByElement = By.xpath(" ");

	By keyboardButtonElement = By.xpath(" ");
	By altPlusNtooltipMessageElement = By.xpath(" ");

	By membershipDropdownByElement = By.xpath(" ");

	By reportsSubButton = By.xpath(" ");
	By currentStockLevelButton = By.xpath(" ");
	By selectedItemDropdown = By.xpath(" ");
	By selectItemSearchBar = By.xpath(" ");
	By accountsItemCheckBox = By.xpath(" ");
	By generalInventoryOption = By.xpath(" ");
	By accountOption = By.xpath(" ");

	By invoiceHeadersSubTab = By.xpath(" ");
	By addNewInvoiceHeaderButton = By.xpath(" ");
	By chooseFileButton = By.id(" ");
	By closeAddNewPatientForm = By.xpath(" ");
	By xButton = By.xpath(" ");
	
	String pageName = this.getClass().getSimpleName();
	public appointment_Pages(WebDriver driver) {
		super(driver);
	}


	/**@Test1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
	
		return false;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
			
		return null;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
		return null;
	}

	/**@Test2
	 * about this method verifyAppointmentModuleIsPresent() 
	 * @param : null
	 * @description : 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyAppointmentModuleIsPresent() throws Exception {
		return null;
	}

	/**@Test3
	 * about this method verifyButtonAndTextIsPresent() 
	 * @param : null
	 * @description : 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyButtonAndTextIsPresent() throws Exception {
		return null;
	}

	/**@Test4
	 * about this method scrollToBottomVerifyFieldAndHighlight() 
	 * @param : null
	 * @description : 
	 * @return : String
	 * @author : YAKSHA
	 */
	public Boolean scrollToBottomVerifyFieldAndHighlight() throws Exception {
		return false;
	}

	/**@Test5
	 * about this method verifyPlaceholderNameOfTexbox() 
	 * @param : null
	 * @description : verify the placeholder name of text box 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyPlaceholderNameOfTexbox() throws Exception {
		return null;
	}

	/**@Test6
	 * about this method verifyErrorMessage() 
	 * @param : null
	 * @description : verify the error message
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyErrorMessage() throws Exception {
		return null;
	}

	/**@Test7
	 * about this method verifyTexboxIsPresentAndValidateEnteredValue() 
	 * @param : null
	 * @description : verify text box , then send value to that text box and validate the entered value
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTexboxIsPresentAndValidateEnteredValue(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@Test8
	 * about this method verifyCheckboxIsSelectedAndDatePickerIsPresent() 
	 * @param : null
	 * @description : click on check box and verify that the check box is selected  or not
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyCheckboxIsSelectedAndDatePickerIsPresent() throws Exception {
		return false;
	}

	/**@Test9
	 * about this method verifySuccessNotificationPopupMessage() 
	 * @param : null
	 * @description : handle the notification pop up
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifySuccessNotificationPopupMessage(Map<String, String> expectedData) throws Exception {
		return null;
	}

	/**@Test10
	 * about this method verifyOptionIsSelectedFromDropdown() 
	 * @param : get the data from Excel file as type Map<String, String> expectedData
	 * @description : it will select the option as per Excel expected data
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyOptionIsSelectedFromDropdown(Map<String, String> expectedData) throws Exception {

		return null;	
	}

	/**@Test11
	 * about this method verifyRadioButton() 
	 * @param : null
	 * @description :
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyRadioButton() throws Exception {
		return false;
	}

	/**@Test12
	 * about this method performJavaScriptOperation() 
	 * @param : null
	 * @description : 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String performJavaScriptOperation(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@Test13
	 * about this method verifyLocatorsValueOfELement() 
	 * @param : Map<String, String>
	 * @description : verify locators value of text box and send value to the text box and highlight that text box
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyLocatorsValueOfELementAndHighLight() throws Exception {
		return null;
	}

	/**@Test14
	 * about this method verifyErrorNotificationPopupMessage() 
	 * @param : null
	 * @description : verify the error message using hard assert
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyErrorNotificationPopupMessage(Map<String, String> expectedData) throws Exception {
		return null;
	}

	/**@Test15
	 * about this method getDataFromTable() 
	 * @param : null
	 * @description : it will fetch the data from the table
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public String getDataFromTable() throws Exception {
		return null;
	}
}
