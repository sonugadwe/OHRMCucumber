
package com.Pages.Admin.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Library;

/**
 * @author sonu
 * @version 1.0.0
 * @since 3rd June 2020
 **/
public class OranageHRM_Admin_Configuration_Localization extends Library {

	public OranageHRM_Admin_Configuration_Localization(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//locating of Admin module
		@FindBy(id = "menu_admin_viewAdminModule")
		WebElement OrangeHRM_Admin_AdminClick;

		//locating of configuration module
		@FindBy(id = "menu_admin_Configuration")
		WebElement OrangeHRM_Admin_ConfigurationClick;

		//locating of localization sub module
		@FindBy(id = "menu_admin_localization")
		WebElement OrangeHRM_Admin_Configuration_LocalizationClick;

		//locating edit button
		@FindBy(xpath = "//input[@value='Edit']")
		WebElement Localization_EditButton;

		//locating language dropdown
		@FindBy(id = "localization_dafault_language")
		WebElement Localization_SelectLanguage_Dropdown;
		
		//locating browser language checkbox
		@FindBy(id = "localization_use_browser_language")
		WebElement OrangeHRM_Admin_Configuration_Localization_Checkbox;

		//locating date format dropdown
		@FindBy(id = "localization_default_date_format")
		WebElement Localization_SelectDateFormat_Dropdown;

		@FindBy(linkText = "Supported languages")
		WebElement Localization_SupportedLanguageClick;

		//locating save button
		@FindBy(id = "btnSave")
		WebElement Localization_SaveButton;

		//Admin click method
		public void OrangeHRM_Admin_AdminClick() {
			OrangeHRM_Admin_AdminClick.click();
			
		}
		//configuration method sub module of Admin
		public void OrangeHRM_Admin_ConfigurationClick() {
			OrangeHRM_Admin_ConfigurationClick.click();
			
		}
		
		//localization page method
		public void OrangeHRM_Admin_Configuration_LocalizationClick() {
			OrangeHRM_Admin_Configuration_LocalizationClick.click();
			
		}
		//edit button method
		public void OrangeHRM_Admin_Configuration_Localization_EditButton() {
			Localization_EditButton.click();
		}
		
		//select langauge from dropdown method
		public void OrangeHRM_Admin_Configuration_Localization_SelectLanguage(String languageName) {
			Select statusDropdown = new Select(Localization_SelectLanguage_Dropdown);
			statusDropdown.selectByVisibleText(languageName);
		}
		
		//select checkbox method
		public void OrangeHRM_Admin_Configuration_Localization_Checkbox() {
			OrangeHRM_Admin_Configuration_Localization_Checkbox.click();
		}
		
		//select date format from dropdown 
		public void OrangeHRM_Admin_Configuration_Localization_SelectDateFormat(int index) {
			Select dropdown = new Select(Localization_SelectDateFormat_Dropdown);
			dropdown.selectByIndex(index);
		}
		
		//save button method
		public void OrangeHRM_Admin_Configuration_Localization_SaveButton() {
			Localization_SaveButton.click();
		}

	}


	/*
	 * @FindBy(xpath="//a[text()="Supported languages"]")
	 * WebElement language;
	 * public void OrangeHRM_Admin_Configuration_Localization_Checkbox()
	 *  { 
	 *  	if(OrangeHRM_Admin_Configuration_Localization_Checkbox.isSelected()) 
	 * 			 {  OrangeHRM_Admin_Configuration_Localization_Checkbox.click();
	 * 					language.click(); 
	 * 					Alert alert=driver.switchTo().alert();
	 * 					alert.accept();
	 * 			 } 
	 * 	}
	 */
	

