using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;
namespace HackerRank
{
    public class TwoDArray
    {
        public TwoDArray()
        {
        }
        static int hourglassSum(int[][] arr)
        {
            int maxval = int.MinValue;
            for (int i = 0; i < 4; ++i)
            {
                for (int j = 1; j < 5; ++j)
                {
                    int val;
                    val = arr[i][j-1] + arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+2][j-1] + arr[i+2][j] + arr[i+2][j+1];
                    if (maxval < val)
                    {
                        maxval = val;
                    }
                }
            }
            return maxval;
        }
        static void Main(string[] args)
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int[][] arr = new int[6][];

            for (int i = 0; i < 6; i++)
            {
                arr[i] = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));
            }

            int result = hourglassSum(arr);
            Console.Write(result);
           

          //  textWriter.WriteLine(result);

            //textWriter.Flush();
            //textWriter.Close();
        }
    }
}
