package ArrayList;
import java.util.*;

public class Basics {

    // Functions That Return List<List<T>>
     public static List<List<Integer>>createMatrix(int rows, int cols){
          List<List<Integer>> matrix  = new ArrayList<>();
          int value = 1;
          for(int i =0; i < rows; i++){
              List<Integer> row = new ArrayList<>();
              for(int j =0; j< cols; j++){
                  row.add(value++);
              }
              matrix.add(row);
          }
          return matrix;
     }
    public static void main(String[] args) {

        //Where to Use Lists in Java
        //Storing Ordered Data – Lists maintain insertion order, making them useful for maintaining sequences of items.
        //Dynamic Arrays – Unlike arrays, lists can grow dynamically.
        //Grouping Similar Data – Lists can store similar objects together, such as a list of students or a list of employees.
        //Matrix Representation – A List<List<T>> can be used to represent a 2D matrix or table.
        //Graph Representation – In adjacency lists for graphs, List<List<Integer>> is commonly used.

        // creating list
        List<String>names =  new ArrayList<>();
        names.add("rahul");
        names.add("Bob");
        System.out.println(names);

        // crating list of list
        List<List<Integer>>matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1,2,3));
        System.out.println(matrix);

        // calling nested loop function
        List<List<Integer>> matrixe = createMatrix(2,2);
        System.out.println(matrixe);

//Iterating Over a List of Lists

        for (List<Integer> row : matrixe) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }
}
