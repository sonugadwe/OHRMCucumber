/**
 * 
 */
package com.Pages.Admin.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

/**
 * @author sonu
 * @version 1.0.0
 * @since 3rd June 2020
 **/  

public class OrangeHRM_Admin_Configuration_Module extends Library {


	public OrangeHRM_Admin_Configuration_Module() {
		PageFactory.initElements(driver, this);
	}

	//locating of Admin module
			@FindBy(id = "menu_admin_viewAdminModule")
			WebElement OrangeHRM_Admin_AdminClick;

			//locating of configuration module
			@FindBy(id = "menu_admin_Configuration")
			WebElement OrangeHRM_Admin_ConfigurationClick;

			//locating of modules 
			@FindBy(id = "menu_admin_viewModules")
			WebElement OrangeHRM_Admin_Configuration_ModulesClick;

			//locating edit button
			@FindBy(xpath = "//input[@value='Edit']")
			WebElement Modules_EditButton;
			
			//locating leave module checkbox
			@FindBy(id = "moduleConfig_leave")
			WebElement Modules_LeaveModule_Checkbox;

			//locating time module checkbox
			@FindBy(id = "moduleConfig_time")
			WebElement Modules_TimeModule_Checkbox;

			//locating recruitment module checkbox
			@FindBy(id = "moduleConfig_recruitment")
			WebElement Modules_RecruitmentModule_Checkbox;

			//locating performance module checkbox
			@FindBy(id = "moduleConfig_performance")
			WebElement Modules_PerformanceModule_Checkbox;

			//locating directory module checkbox
			@FindBy(id = "moduleConfig_directory")
			WebElement Modules_DirectoryModule_Checkbox;

			//locating maintenance module checkbox
			@FindBy(id = "moduleConfig_maintenance")
			WebElement Modules_MaintenanceModule_Checkbox;

			//locating all checkbox
			@FindBy(xpath = "//input[@class='checkbox']")
			WebElement Modules_AllCheckbox;
			
			//locating save button
			@FindBy(id="btnSave")
			WebElement Modules_SaveButton;

			//click admin method
			public void OrangeHRM_Admin_AdminClick() {
				OrangeHRM_Admin_AdminClick.click();
			}
			
			//click configuration submodules of admin
			public void OrangeHRM_Admin_ConfigurationClick() {
				OrangeHRM_Admin_ConfigurationClick.click();
			}
			
			//click modules page method
			public void OrangeHRM_Admin_Configuration_ModulesClick() {
				OrangeHRM_Admin_Configuration_ModulesClick.click();
			}

			//edit button method
			public void OrangeHRM_Admin_Configuration_Modules_EditButton() {
				Modules_EditButton.click();
			}
			
			//select module checkbox method
			public void OrangeHRM_Admin_Configuration_Modules_Select_CheckBox() {
				/*System.out.println(Modules_AllCheckbox.getSize());
				boolean allCheckbox=Modules_AllCheckbox.isSelected();
				if(allCheckbox==false) {
					Modules_AllCheckbox.click();
				}
				System.out.println(Modules_AllCheckbox.isSelected());*/
				
				boolean leaveCheckBox=Modules_LeaveModule_Checkbox.isSelected();
				if(leaveCheckBox==false) {
					Modules_LeaveModule_Checkbox.click();
				}
				boolean timeCheckBox=Modules_TimeModule_Checkbox.isSelected();
				if(timeCheckBox==false) {
					Modules_TimeModule_Checkbox.click();
				}
				boolean recruitmentCheckBox=Modules_RecruitmentModule_Checkbox.isSelected();
				if(recruitmentCheckBox==false) {
					Modules_RecruitmentModule_Checkbox.click();
				}
				boolean performanceCheckBox=Modules_PerformanceModule_Checkbox.isSelected();
				if(performanceCheckBox==false) {
					Modules_PerformanceModule_Checkbox.click();
				}
				boolean directoryCheckBox=Modules_DirectoryModule_Checkbox.isSelected();
				if(directoryCheckBox==false) {
					Modules_DirectoryModule_Checkbox.click();
				}
				
				boolean maintenceCheckBox=Modules_MaintenanceModule_Checkbox.isSelected();
				if(maintenceCheckBox==false) {
					Modules_MaintenanceModule_Checkbox.click();
				}
			}
			
			//save button method
			public void OrangeHRM_Admin_Modules_SaveButton() {
				Modules_SaveButton.click();
			}

		}
