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
    public class Array_DS

    {
        public Array_DS()
        {
        }

        static int[] reverseArray_mine(int[] a) {
            int[] b = a;
            Array.Reverse(b);
            return b;
            
        }
       
        static void Main(string[] args)
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int arrCount = Convert.ToInt32(Console.ReadLine());

            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));
            int[] res = reverseArray_mine(arr);
            Array.ForEach(res, Console.WriteLine);

            /*textWriter.WriteLine(string.Join(" ", res));

            textWriter.Flush();
            textWriter.Close();*/
        }
    }
}
