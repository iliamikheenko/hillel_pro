package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        FileData file1 = new FileData("file1", 21, "path1");
        FileData file2 = new FileData("file2", 23, "path2");
        FileData file3 = new FileData("file3", 43, "path3");
        FileData file4 = new FileData("file4", 4, "path2");
        FileData file5 = new FileData("file5", 52, "path3");
        FileData file6 = new FileData("file6", 16, "path3");


        FileNavigator xFiles = new FileNavigator();
//        System.out.println(xFiles.filterBySize(1));

//        xFiles.add("path1", file1);
//        xFiles.add("path2", file2);
//        xFiles.add("path3", file3);
//        xFiles.add("path2", file4);
//        xFiles.add("path3", file5);
//        xFiles.add("path3", file6);
//        xFiles.add("path4", new FileData("file7", 7, "path4"));

//        System.out.println(xFiles.find("path7"));
//        System.out.println(xFiles);
//        System.out.println(xFiles.filterBySize(0));
//        xFiles.remove("path1");
//        xFiles.remove("path2");
//        xFiles.remove("path3");
//        System.out.println(xFiles);
//        System.out.println(xFiles.sortBySize());
        System.out.println(xFiles.find("1"));
        System.out.println(xFiles.sortBySize());
        System.out.println(xFiles.filterBySize(2));
        xFiles.remove("1");
    }

}
