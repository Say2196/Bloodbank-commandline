package Test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import bloodstock.model.BloodGroup;
import bloodstock.model.BloodGroupDAO;
import bloodstock.model.BloodGroupDAOImpl;
import donors.model.DonorDAO;
import donors.model.DonorDAOImpl;
import donors.model.Donors;
import reqblood.model.UserReg;
import reqblood.model.UserRegDAO;
import reqblood.model.UserRegDAOImpl;

public class Main {

	public static void main(String[] args) throws SQLException, ParseException {

		System.out.println("WELCOME TO BLOOD BANK");
        System.out.println("=========================================");
        System.out.println("A. Donate the Blood\r\n" +  
                   "B. Request for Blood\r\n" +  
                   "C. Check BloodStock\r\n" + 
                   "D. Exit");
        System.out.println("********************************************");
        System.out.println("Enter the Choice");
        Scanner sc1=new Scanner(System.in);
        System.out.println("*********************************************");
           String choice=sc1.nextLine();
           while(1==1)
           {
           switch(choice) {
           case "A":
               System.out.println("********************************************");
               System.out.println("A. Veiw Doner \r\n" +  
                           "B. Add Doner\r\n" +  
                           "C. Update Doner\r\n" + 
                           "D. Delete Doner\r\n" + 
                           "E. Search Doner\r\n" + 
                           "F. Exit to Main menu");

System.out.println("********************************************");
               System.out.println("Enter the Choice");
               String choice1=sc1.nextLine();
               System.out.println("********************************************");
               DonorDAO ddao=new DonorDAOImpl();
               switch(choice1)
               {
               case "A":System.out.println("veiw doner");
                        ddao.read();
                   break;  
               case "B":System.out.println("Add donor");
                        System.out.println("Enter First Name");
                        System.out.println("========================");
                        String firstname=sc1.nextLine();
                        System.out.println("Enter Last Name");
                        System.out.println("========================");
                        String lastname=sc1.nextLine();
                        System.out.println("Enter Age");
                        System.out.println("========================");
                        String age=sc1.nextLine();
                        int age1=Integer.parseInt(age);
                        System.out.println("Enter Gender");
                        System.out.println("========================");
                        String gender=sc1.nextLine();
                        System.out.println("Enter Date of Birth");
                        System.out.println("========================");
                        String dateofbirth=sc1.nextLine();
                        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
                        Date dateofbirth1=sdf.parse(dateofbirth);
                        System.out.println("Enter Height");
                        System.out.println("========================");
                        String height=sc1.nextLine();
                        int height1=Integer.parseInt(height);
                        System.out.println("Enter weight");
                        System.out.println("========================");
                        String weight=sc1.nextLine();
                        int weight1=Integer.parseInt(weight);
                        System.out.println("Enter email id");
                        System.out.println("========================");
                        String mailid=sc1.nextLine();
                        System.out.println("Enter Contact number");
                        System.out.println("========================");
                        String phnno=sc1.nextLine();
                        System.out.println("Enter Address");
                        System.out.println("========================");
                        String address=sc1.nextLine();
                        System.out.println("Enter your Blood group");
                        System.out.println("========================");
                        String bldgrp=sc1.nextLine();
                        System.out.println("Dononted Blood since last year? (give your response in form of 'Y' for yes & 'N' for no)");
                        System.out.println("========================");
                        String flag=sc1.nextLine();
                        System.out.println("Enter your Last Blood donation Date");
                        System.out.println("========================");
                        String lastblooddonation=sc1.nextLine();
                        SimpleDateFormat sdf1=new SimpleDateFormat("dd-MMM-yyyy");
                        Date lastblooddonation1=sdf1.parse(lastblooddonation);
                        
                        
                        Donors donor=new Donors(firstname,lastname,age1,gender,dateofbirth1,height1,weight1,mailid,phnno,address,bldgrp,flag,lastblooddonation1);
                        ddao.create(donor);
                        System.out.println("Donor Registered successfully");
                   break;   
               case "C": System.out.println("Enter Donor's ID: ");
                         System.out.println("=====================");
                         String uid=sc1.nextLine();
                         int duid=Integer.parseInt(uid);
                         System.out.println("Enter First Name");
                         System.out.println("========================");
                         String firstname1=sc1.nextLine();
                         System.out.println("Enter Last Name");
                         System.out.println("========================");
                         String lastname1=sc1.nextLine();
                         System.out.println("Enter Age");
                         System.out.println("========================");
                         String age_u=sc1.nextLine();
                         int age2=Integer.parseInt(age_u);
                         System.out.println("Enter Gender");
                         System.out.println("========================");
                         String gender1=sc1.nextLine();
                         System.out.println("Enter Date of Birth");
                         System.out.println("========================");
                         String dateofbirth_u=sc1.nextLine();
                         SimpleDateFormat sdfu=new SimpleDateFormat("dd-MMM-yyyy");
                         Date dateofbirth2=sdfu.parse(dateofbirth_u);
                         System.out.println("Enter Height");
                         System.out.println("========================");
                         String height_u=sc1.nextLine();
                         int height2=Integer.parseInt(height_u);
                         System.out.println("Enter weight");
                         System.out.println("========================");
                         String weight_u=sc1.nextLine();
                         int weight2=Integer.parseInt(weight_u);
                         System.out.println("Enter email id");
                         System.out.println("========================");
                         String mailid1=sc1.nextLine();
                         System.out.println("Enter Contact number");
                         System.out.println("========================");
                         String phnno1=sc1.nextLine();
                         System.out.println("Enter Address");
                         System.out.println("========================");
                         String address1=sc1.nextLine();
                         System.out.println("Enter your Blood group");
                         System.out.println("========================");
                         String bldgrp1=sc1.nextLine();
                         System.out.println("Dononted Blood since last year? (give your response in form of 'Y' for yes & 'N' for no)");
                         System.out.println("========================");
                         String flag1=sc1.nextLine();
                         System.out.println("Enter your Last Blood donation Date");
                         System.out.println("========================");
                         String lastblooddonation_u=sc1.nextLine();
                         SimpleDateFormat sdfu1=new SimpleDateFormat("dd-MMM-yyyy");
                         Date lastblooddonation2=sdfu1.parse(lastblooddonation_u);
                         
                         Donors donoru=new Donors(duid,firstname1,lastname1,age2,gender1,dateofbirth2,height2,weight2,mailid1,phnno1,address1,bldgrp1,flag1,lastblooddonation2);
                         ddao.update(donoru);
                         System.out.println("Donor updated successfully");
                         
                   break;   
               case "D": System.out.println("Enter Donor's Id: ");
                         int id=sc1.nextInt();
                         ddao.delete(id);
                         System.out.println("Record deleted successfully");
                         System.out.println("=================================================================");
                   break; 
               case "E": System.out.println("Enter Donor's ID: ");
                         int did=sc1.nextInt();
                         ddao.read(did);
                       
                   break;  
               case "F": System.out.println("THANK YOU FOR VISIT!");
                         return; 
               
               }
               
               break;
           case "B":    System.out.println("********************************************");
           System.out.println("A. Veiw Request \r\n" +  
                   "B. Request for blood\r\n" +  
                   "C. Update details of request for blood\r\n" + 
                   "D. Cancel blood request\r\n" + 
                   "E. Search blood request\r\n" + 
                   "F. Exit to Main menu");

System.out.println("********************************************");
       System.out.println("Enter the Choice");
       String choice2=sc1.nextLine();
       System.out.println("********************************************");
       UserRegDAO udao=new UserRegDAOImpl();
       switch(choice2)
       {
       case "A": System.out.println("View the rquests for blood");
                 System.out.println("============================");
                 udao.read();
                 System.out.println("============================");
    	   break;
       
       case "B":  System.out.println("Request for blood");
       System.out.println("Enter First Name");
       System.out.println("========================");
       String firstname=sc1.nextLine();
       System.out.println("Enter Last Name");
       System.out.println("========================");
       String lastname=sc1.nextLine();
       System.out.println("Enter Age");
       System.out.println("========================");
       String age=sc1.nextLine();
       int age1=Integer.parseInt(age);
       System.out.println("Enter Gender");
       System.out.println("========================");
       String gender=sc1.nextLine();
       System.out.println("Enter email id");
       System.out.println("========================");
       String mailid=sc1.nextLine();
       System.out.println("Enter Contact number");
       System.out.println("========================");
       String phnno=sc1.nextLine();
       System.out.println("Enter Address");
       System.out.println("========================");
       String address=sc1.nextLine();
       System.out.println("Enter blood group");
       System.out.println("========================");
       String bldgrp=sc1.nextLine();
       System.out.println("Enter the number of blood requirement");
       System.out.println("======================================");
       String unit=sc1.nextLine();
       int unit1=Integer.parseInt(unit);
       
       UserReg user=new UserReg(firstname,lastname,age1,gender,mailid,phnno,address,bldgrp,unit1);
       udao.create(user);
       System.out.println("Your request has been registered successfully");
      
       
    	   break;
       
       case "C": System.out.println("Enter ID here");
                 System.out.println("=======================");
    	         String reqid=sc1.nextLine(); 
    	         System.out.println("Enter First Name");
    	         System.out.println("========================");
    	         String firstname_req=sc1.nextLine();
    	         System.out.println("Enter Last Name");
    	         System.out.println("========================");
    	         String lastname_req=sc1.nextLine();
    	         System.out.println("Enter Age");
    	         System.out.println("========================");
    	         String age2=sc1.nextLine();
    	         int age_req=Integer.parseInt(age2);
    	         System.out.println("Enter Gender");
    	         System.out.println("========================");
    	         String gender_req=sc1.nextLine();
    	         System.out.println("Enter email id");
    	         System.out.println("========================");
    	         String mailid_req=sc1.nextLine();
    	         System.out.println("Enter Contact number");
    	         System.out.println("========================");
    	         String phnno_req=sc1.nextLine();
    	         System.out.println("Enter Address");
    	         System.out.println("========================");
    	         String address_req=sc1.nextLine();
    	         System.out.println("Enter blood group");
    	         System.out.println("========================");
    	         String bldgrp_req=sc1.nextLine();
    	         System.out.println("Enter the number of blood requirement");
    	         System.out.println("======================================");
    	         String unit2=sc1.nextLine();
    	         int unit_req=Integer.parseInt(unit2);
    	         
    	         UserReg user1=new UserReg(reqid,firstname_req,lastname_req,age_req,gender_req,mailid_req,phnno_req,address_req,bldgrp_req,unit_req);
    	         udao.update(user1);
    	         System.out.println("Request details have been successfully updated");
    	   break;
       
       case "D": System.out.println("Enter request id here");
                 System.out.println("=======================");
                 String dreqid=sc1.nextLine();
                 udao.delete(dreqid);
                 System.out.println("Your request for blood has been cancelled");
    	   break;
       
       case "E": System.out.println("Enter request id here");
                 System.out.println("=========================");
                 String sreqid=sc1.nextLine();
                 udao.read(sreqid);
                 System.out.println("======================================================");
    	   break;
       
       case "F":  System.out.println("THANK YOU FOR VISIT!"); 
    	          return;
       }
               break;   
           case "C":   System.out.println("********************************************");
           System.out.println("A. Veiw blood stock \r\n" +  
                   "B. Search blood stock\r\n" +  
                   "C. Update blood stock\r\n" + 
                   "D. Exit\r\n");
           
           System.out.println("********************************************");
           System.out.println("Enter the Choice");
           String choice3=sc1.nextLine();
           System.out.println("********************************************");
           BloodGroupDAO bdao=new BloodGroupDAOImpl();
           switch(choice3)
           {
           case "A": System.out.println("View blood stock");
                     System.out.println("========================");
                     bdao.read();
                     System.out.println("========================");
        	        break;
           
           case "B": System.out.println("Enter blood group here");
                     System.out.println("=========================");
                     String blgrp=sc1.nextLine();
                     bdao.read(blgrp);
                     System.out.println("=========================");
        	   break;
           
           case "C": System.out.println("Enter blood group here");
                     System.out.println("=========================");
                     String bldgrp=sc1.nextLine();
                     System.out.println("Enter the number of units to be added");
                     System.out.println("========================================");
                     String unit=sc1.nextLine();
                     int unit1=Integer.parseInt(unit);
                     
                     BloodGroup bgrp=new BloodGroup(bldgrp,unit1);
                     
                     bdao.update(bgrp);
                     System.out.println("Blood stock has been updated successfully");
        	   break;
           
           case "D": System.out.println("THANK YOU FOR VISIT!");
                     return;
        	   
           }
               break;   
           case "D": System.out.println("=============================================================");
                     System.out.println("THANK YOU FOR CHOOSING NATIONAL BLOODBANK, VISIT AGAIN!");
                     System.out.println("==============================================================");
                     return;
           
           
           }
           }
    }
	

}
