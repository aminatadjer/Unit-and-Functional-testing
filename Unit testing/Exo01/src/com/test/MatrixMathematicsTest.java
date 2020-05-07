package com.test;

import com.exception.NoSquareException;
import com.model.Matrix;
import com.service.MatrixMathematics;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixMathematicsTest {

    @Test
    public void test () throws NoSquareException {
        double [][] data ={{4,7},{21,3}};

        Matrix matrice = new Matrix(data);

        Assert.assertEquals(new MatrixMathematics().determinant(matrice),-135,0);

    }
   @Test(expected = NoSquareException.class)
    public void testNoSquare () throws NoSquareException {

        double [][] data ={{4},{21,2,3}};

        Matrix matrice = new Matrix(data);
       new MatrixMathematics();
       MatrixMathematics.determinant(matrice);

    }
  @Test
  public void test1 () throws NoSquareException {
      double [][] data ={{4}};

      Matrix matrice = new Matrix(data);

      Assert.assertEquals(new MatrixMathematics().determinant(matrice),4,0);

  }
    @Test
    public void test3 () throws NoSquareException {
        double [][] data ={{4,3,4},{5,8,9},{4,3,4}};

        Matrix matrice = new Matrix(data);

        Assert.assertEquals(new MatrixMathematics().determinant(matrice),0,0);

    }




}