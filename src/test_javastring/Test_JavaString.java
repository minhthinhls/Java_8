/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_javastring;

/**
 *
 * @author thinh.huynh
 */
public class Test_JavaString {
    
    public static boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
    
    public static String removeExtension(String s) {

        String separator = System.getProperty("file.separator");
        String filename;

        // Remove the path upto the filename.
        int lastSeparatorIndex = s.lastIndexOf(separator);
        if (lastSeparatorIndex == -1) {
            filename = s;
        } else {
            filename = s.substring(lastSeparatorIndex + 1);
        }

        // Remove the extension.
        int extensionIndex = filename.lastIndexOf(".");
        if (extensionIndex == -1)
            return filename;

        return filename.substring(0, extensionIndex);
    }
    
    public static String getExtension(String s) {

        String separator = System.getProperty("file.separator");
        String filename;

        // Remove the path upto the filename.
        int lastSeparatorIndex = s.lastIndexOf(separator);
        if (lastSeparatorIndex == -1) {
            filename = s;
        } else {
            filename = s.substring(lastSeparatorIndex + 1);
        }

        // Remove the extension.
        int extensionIndex = filename.lastIndexOf(".");
        if (extensionIndex == -1)
            return filename;

        return filename.substring(extensionIndex, s.length());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "[1]_minhthinh[1]";
        String s2 = "minhthinh[10]";
        int count = 1;
        
        for (int i = s1.length()-1; (s1.charAt(i)!='[')&&(i>0) ; i--){
            count++;
        }
        
        System.out.println("Counting number: " + count);
        
        int nameLength = s1.length();
        int nameLength2 = s2.length();
        System.out.println("S1: " + nameLength + "\nS2: " + nameLength2);/*
        int startIndex = s1.indexOf("[", (nameLength - count) > 0 ? nameLength-count : 0);
        int endIndex = s1.indexOf("]", nameLength - 1);
        String toBeReplaced = s1.substring(startIndex > 0 ? startIndex : 0, endIndex + 1);
        String originalName = s1.replace(toBeReplaced, "");
        System.out.println("This is the old print: " + originalName);
        */
        System.out.println("Length - count = " + (s1.length() - count));
        String origin = s1.substring(0, (s1.length()-count) > 0 ? s1.length()-count : s1.length());
        System.out.println("This is the new print: " + origin);
        
        String originalName;
        
        if (count > 4){
            originalName = s1;
        }else{
            originalName = s1.substring(0, s1.length()-count);
        }
        
        System.out.println("Basic Original Name: " + originalName);
        System.out.println("\n\n\n\n");
        /*
            int nameLength = file.getFileName().length();
            int startIndex = file.getFileName().indexOf("[", nameLength-count);
            int endIndex = file.getFileName().indexOf("]", nameLength-1);
            String toBeReplaced = file.getFileName().substring(startIndex, endIndex + 1);
            String originalName = file.getFileName().replace(toBeReplaced, "");
        */ // This is the old one for Image Service
        
        /*
            int count = 1;
            String tempName = file.getFileName();
            for (int i = tempName.length()-1; (tempName.charAt(i)!='[')&&(i>=0) ; i--){
                count++;
            }
            String originalName;
            if (count > 4){
                originalName = tempName;
            }else{
                originalName = tempName.substring(0, tempName.length()-count);
            }
        */ // This is one of the code for Image Service
        
        
        String test = "assignment[1].png";
        int x = test.lastIndexOf(".");
        String extension = test.substring(test.lastIndexOf("."), test.length());
                
        System.out.println("Picture Name: " + test);
        
        test = removeExtension(test);
        System.out.println("Picture Name after removing Extension: " + test);
        
        if(test.length() >= 4){
            String subtest = test.substring(test.length()-3, test.length());
            System.out.println("Picture subName: " + subtest);

            if( subtest.contains("[") && subtest.contains("]") ){

                String subnumber = subtest.substring(1,2);
                System.out.println("Sub Number: " + subnumber);

                if(isInteger(subnumber)){
                    System.out.println("Ready to Remove [Number] from: " + test );
                    test = test.substring(0, test.length()-3);
                }
            }

            System.out.println("The final STRING: " + test);
        }
            String getExtension = getExtension("assignment[1]");
            test = test + getExtension;
            System.out.println("Add extension back to the name: " + test);
            System.out.println(x);
        
    }
    
    
    
        
     
        
        
        /*
        int startIndex = test.indexOf("[", test.length()-4);
        int endIndex = test.indexOf("]", test.length()-1);
        String toBeReplaced = test.substring(startIndex, endIndex + 1);
        String newName = test.replace(toBeReplaced, "");
        System.out.println(newName);
        */
        
        
    }
    
