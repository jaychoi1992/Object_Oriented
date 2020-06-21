//https://www.hackerrank.com/challenges/sparse-arrays/problem
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
    public class SparseArray
    {
        public SparseArray()
        {
        }
        static int[] othersolution(string[] strings, string[] queries)
        {
            int idx = 0;
            int[] result = new int[queries.Length];
            foreach (string query in queries)
            {
                result[idx++] = strings.Where(temp => temp == query).Count();
            }
            return result;
        }

        static int[] matchingStrings(string[] strings, string[] queries)
        {
            int[] result = new int[queries.Length];
            int idx = 0;
            foreach (string query in queries)
            {
                int counter = 0;
                
                foreach (string str in strings)
                {
                    if (query == str)
                    {
                        counter += 1;
                    }
                }
                result[idx] = counter;
                ++idx;
            }
            return result;
        }
        static void Main(string[] args)
        {
           // TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int stringsCount = Convert.ToInt32(Console.ReadLine());

            string[] strings = new string[stringsCount];

            for (int i = 0; i < stringsCount; i++)
            {
                string stringsItem = Console.ReadLine();
                strings[i] = stringsItem;
            }

            int queriesCount = Convert.ToInt32(Console.ReadLine());

            string[] queries = new string[queriesCount];

            for (int i = 0; i < queriesCount; i++)
            {
                string queriesItem = Console.ReadLine();
                queries[i] = queriesItem;
            }

            int[] res = matchingStrings(strings, queries);

            Array.ForEach(res, Console.WriteLine);
           // textWriter.WriteLine(string.Join("\n", res));

           // textWriter.Flush();
           // textWriter.Close();
        }
    }
}
