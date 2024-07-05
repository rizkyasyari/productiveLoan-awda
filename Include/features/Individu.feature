#Author: your.email@your.domain.com
@Individu
Feature: Positive - Create New individu Form
  I want to create a sucess new individu form

	@IndividuForm
  Scenario: Business Capital Financing Loan Application Individu
    Given I open the Url
    When I choice individu on loan application form
    And I write phone number form
    And I write otp code form
    And I click Lanjut button
    Then verify the Pertanyaan Pembiyaan in step
    
  #@Individu-Stage1-WorkingCapital
  #Scenario: Loan Application Individu - Working Capital
    #Given I on Pertanyaan Pembiyaan step
    #When I choice "Working Capital" on financing products form
    #And I choice "12 Bulan" loan tenor form
    #And I write "50000000" on loan amount form
    #And I choice "Inventaris Usaha" loan tenor form
    #And I click Lanjut button
    #Then I verify the Data Pribadi in step
#
#	@Individu-Stage1-InvoiceFinancing
  #Scenario: Loan Application Individu - Invoice Financing
    #Given I on Pertanyaan Pembiyaan step
    #When I choice "Invoice Financing" on financing products form
    #And I choice "3 Bulan" loan tenor form
    #And I write "50000000" on loan amount form
    #And I choice "Inventaris Usaha" loan tenor formrm
    #And I click Lanjut button
    #Then I verify the Data Pribadi in step
    #
  #@Individu-Stage2-Partner
  #Scenario: Individu Working Capital - With Partner Data
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
    #
  #@Individu-Stage2-WithoutPartner
  #Scenario: Individu Working Capital - Without Partner Data
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step


    