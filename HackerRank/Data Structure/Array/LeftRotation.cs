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
    public class LeftRotation
    {
        public LeftRotation()
        {
        }
        static void Main(string[] args)
        {
            string[] nd = Console.ReadLine().Split(' ');

            int n = Convert.ToInt32(nd[0]);

            int d = Convert.ToInt32(nd[1]);

            int[] a = Array.ConvertAll(Console.ReadLine().Split(' '), aTemp => Convert.ToInt32(aTemp));

            // Rotate values in array according to rotation shift number 
            int[] b = a[d..].Concat(a[0..d]).ToArray();

            //Print out Array
            foreach (int val in b)
            {
                Console.WriteLine(val);
            }

            b.ToList().ForEach(i => Console.WriteLine(i));
            Console.WriteLine("[{0}]", string.Join(", ", b));
            Array.ForEach(b, Console.WriteLine);


        }
    }
}
