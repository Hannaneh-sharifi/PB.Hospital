

import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        System.out.println("welcome");

        Patient patient1 = new Patient("khalil", "Khalili", "ahmad ahmadi", "ppp", "1401/08/16", 1348, "male", "3311");
        Patient patient2 = new Patient("jamshid", "salehi", "ali alipoor", "xxx", "1403/11/1", 1350, "male", "7777");
        Patient patient3 = new Patient("ghazal", "sirvani", "saeed sinapoor", "yyy", "1402/10/11", 1380, "female", "6200");
        Patient patient4 = new Patient("shirin", "reza nejhad", "ali alipoor", "ooo", "1400/04/29", 1379, "female", "6666");
        Patient patient5 = new Patient("marzieh", "seyfi", "ghorgali najoorzadeh ", "sss", "1402/10/12", 1382, "female", "4009");

        Nurse nurse1 = new Nurse("narmin", "rasooli", "4499", "pobb34");
        Nurse nurse2 = new Nurse("hasan", "hasani", "3007", "deea2");
        Nurse nurse3 = new Nurse("roya", "akbari", "1144", "jiko9");
        Nurse nurse4 = new Nurse("sara", "zeinali", "6109", "weet1");
        Nurse nurse5 = new Nurse("reza", "shams", "8082", "hooo9");

        Receptionist receptionist1 = new Receptionist("22gg", "6709", "roya", "sam");
        Receptionist receptionist2 = new Receptionist("40ii", "5500", "ali", "babaee");


        Hospital hospital = new Hospital();

        hospital.patients.add(patient1);
        hospital.patients.add(patient2);
        hospital.patients.add(patient3);
        hospital.patients.add(patient4);
        hospital.patients.add(patient5);

        hospital.addPatientsIds((patient1.getPatientId()));
        hospital.addPatientsIds((patient2.getPatientId()));
        hospital.addPatientsIds((patient3.getPatientId()));
        hospital.addPatientsIds((patient4.getPatientId()));
        hospital.addPatientsIds((patient5.getPatientId()));

        hospital.nurses.add(nurse1);
        hospital.nurses.add(nurse2);
        hospital.nurses.add(nurse3);
        hospital.nurses.add(nurse4);
        hospital.nurses.add(nurse5);

        hospital.addNursesIds((nurse1.getNurseID()));
        hospital.addNursesIds((nurse2.getNurseID()));
        hospital.addNursesIds((nurse3.getNurseID()));
        hospital.addNursesIds((nurse4.getNurseID()));
        hospital.addNursesIds((nurse5.getNurseID()));

        hospital.addNursesPasscodes((nurse1.getPassCode()));
        hospital.addNursesPasscodes((nurse2.getPassCode()));
        hospital.addNursesPasscodes((nurse3.getPassCode()));
        hospital.addNursesPasscodes((nurse4.getPassCode()));
        hospital.addNursesPasscodes((nurse5.getPassCode()));

        hospital.addReceptionistIDS(receptionist1.getID());
        hospital.addReceptionistPassCodes(receptionist1.getPassCode());
        hospital.addReceptionistIDS(receptionist2.getID());
        hospital.addReceptionistPassCodes(receptionist2.getPassCode());


        System.out.println("menu:");
        System.out.println("1)nurse");
        System.out.println("2)receptionist");
        System.out.println("please enter your desired option");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        try {
              switch (choice) {
                  case 1:
                       System.out.println("please enter ID:");
                       Scanner scanner1 = new Scanner(System.in);
                       String id = scanner1.nextLine();
                       System.out.println("please enter passcode:");
                       Scanner scanner2 = new Scanner(System.in);
                       String passCode = scanner2.nextLine();

                       if (hospital.verifyNurse(id, passCode)) {
                          System.out.println("welcome dear nurse!");
                          System.out.println("enter your login time:");

                          Scanner scanner9 = new Scanner(System.in);
                          String time = scanner9.nextLine();
                          NurseLoginTime newLoginTime = new NurseLoginTime(id, time);

                          int choice2;
                          System.out.println("1)updating the patient file");
                          System.out.println("2)change passcode");
                          System.out.println("please enter your desired option:");

                          Scanner scanner3 = new Scanner(System.in);
                          choice2 = scanner3.nextInt();

                          switch (choice2) {
                              case 1:
                                  System.out.println("please enter patient ID:");
                                  Scanner scanner4 = new Scanner(System.in);
                                  String pId = scanner4.nextLine();
                                  if (hospital.verifyPatients(pId)) {
                                    System.out.println("correct!" + "enter new information");
                                    Scanner scanner51=new Scanner(System.in);
                                    patient1.setBirth(1399);
                                    patient3.setDateOfHospitalization("1402/12/12");
                                    patient1.addDrugs("eee");
                                    patient2.removeDrugs("ppp");
                                  }
                                  else if (!hospital.verifyPatients(pId)) {
                                    System.out.println("this patient does not exist");
                                  }
                              break;
                                  
                              case 2:
                                  System.out.println("enter Id & current passcode:");
                                  Scanner scanner10 = new Scanner(System.in);
                                  String currentPasscode = scanner10.nextLine();
                                  Scanner scanner12 = new Scanner(System.in);
                                  String iD = scanner12.nextLine();

                                  if (hospital.verifyNurse(currentPasscode, iD)) {
                                    Scanner scanner6 = new Scanner(System.in);
                                    String newPasscode = scanner6.nextLine();
                                    nurse1.setNurseID(newPasscode);

                                  }
                                  else {
                                    System.out.println("incorrect ID or passcode");
                                  }
                                  break;
                  }
                       }
                    else if (!hospital.verifyNurse(id, passCode)) {
                        throw new IncorrectPasswordException("invalid login");

                    }

                    break;

                case 2:
                    System.out.println("enter your ID:");
                    Scanner scanner13 = new Scanner(System.in);
                    String iD = scanner13.nextLine();
                    System.out.println("enter your passCode:");
                    Scanner scanner14 = new Scanner(System.in);
                    String passcode = scanner14.nextLine();
                    if (hospital.verifyReceptionist(iD, passcode)) {
                        int choice3;
                        System.out.println("1)add new patient");
                        System.out.println("2)remove patient");
                        System.out.println("3)search patient");
                        System.out.println("4)display all patient files");
                        System.out.println("please enter your desired option:");
                        Scanner scanner8 = new Scanner(System.in);
                        choice3 = scanner8.nextInt();
                        switch (choice3) {
                            case 1:
                                Patient newPatient = new Patient("sina", "karimi", "sara alizade", "fff", "1402/08/30", 1376, "male", "7777");
                                if (!hospital.patients.contains(newPatient)) {
                                    hospital.patients.add(newPatient);
                                } else {
                                    System.out.println("this patient is already exist");
                                }
                                break;

                            case 2:
                                Patient patientX = new Patient("setia", "salimi", "sara alizade", "qqq", "1402/01/30", 1397, "female", "3300");
                                if (hospital.patients.contains(patientX)) {
                                    hospital.patients.remove(patientX);
                                } else {
                                    System.out.println("this patient does not exist");
                                }
                                break;

                            case 3:
                                break;
                            case 4:
                                hospital.getPatients();
                                break;
                        }
                    } else if (!hospital.verifyReceptionist(iD, passcode)) {
                        throw new IncorrectPasswordException("invalid login");
                    }


             break;
             default:
                   System.out.println("the entered option is not correct");
             }

        }
        catch (IncorrectPasswordException e) {
            System.out.println("invalid login" + e);
        }
    }
}




