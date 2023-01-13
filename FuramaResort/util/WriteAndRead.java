package FuramaResort.util;

import FuramaResort.Model.CustomerModel;
import FuramaResort.Model.EmployeeModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndRead {


    public static void writeEmployee(String pathFile, List<EmployeeModel> employeeModels, boolean append){
        List<String> stringList = new ArrayList<>();
        for (EmployeeModel e: employeeModels) {
            stringList.add(e.toString());
        }
        writer(pathFile, stringList, true);
    }
    public static void writeCustomer(String pathFile, List<CustomerModel> customerModels, boolean append){
        List<String> stringList = new ArrayList<>();
        for (CustomerModel e: customerModels) {
            stringList.add(e.toString());
        }
        writer(pathFile, stringList, true);
    }

    public static List<EmployeeModel> readEmployee(String pathFile){
        List<EmployeeModel> employeeModels = new ArrayList<>();
        List<String> stringList = read(pathFile);
        for (String s: stringList) {
            String [] array = s.split(",");
            EmployeeModel employeeModel = new EmployeeModel(array[0], array[1], EnumGender(array[2]),
                    Integer.parseInt(array[3]),Integer.parseInt(array[4])
                    ,array[5],EnumDegree(array[6]),EnumPositionID(array[7]),Double.parseDouble(array[8]));
            employeeModels.add(employeeModel);
        }
        return employeeModels;
    }

    private static ContanUtil.PositionID EnumPositionID(String str) {
        if ("Receptionist".equals(str)){
            return ContanUtil.PositionID.Receptionist;
        }if ("Director".equals(str)){
            return ContanUtil.PositionID.Director;
        }if ("Manager".equals(str)){
            return ContanUtil.PositionID.Manager;
        }if ("Waiter".equals(str)){
            return ContanUtil.PositionID.Waiter;
        }if ("Monitoring".equals(str)){
            return ContanUtil.PositionID.Monitoring;
        }
        return null;
    }

    private static ContanUtil.Degree EnumDegree(String str) {
        if ("Intermediate".equals(str)){
            return ContanUtil.Degree.Intermediate;
        }else if ("University".equals(str)){
            return ContanUtil.Degree.University;
        }else if ("College".equals(str)){
            return ContanUtil.Degree.College;
        }else if ("MastersDegree".equals(str)){
            return ContanUtil.Degree.MastersDegree;
        }
        return null;
    }

    private static ContanUtil.Gender EnumGender(String str) {
        if ("Male".equals(str)) {
            return ContanUtil.Gender.Male;
        }
        else if ("Female".equals(str)) {
            return ContanUtil.Gender.Female;
        }
        return null;
    }

    private static void writer(String pathFile, List<String> strings, boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : strings) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> read(String pathFile){
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
//            bufferedReader.close();
//            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

}
