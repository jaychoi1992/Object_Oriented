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
    public class DynamicArray
    {
        public DynamicArray()
        {
        }
        public static List<int> dynamicArray(int n, List<List<int>> queries)
        {
            int lastAnswer = 0;
            int loc = 0;
            List<List<int>> seq = new List<List<int>>(n);
            List<int> last = new List<int>();
            for (int i = 0; i < n; i++)
            {
                List<int> temp = new List<int>();
                seq.Add(temp);
            }
            foreach (List<int> query in queries)
            {
                loc = (query[1] ^ lastAnswer) % n;
                if (query[0] == 1)
                {
                    seq[loc].Add(query[2]);
                }
                else
                {
                    int size = seq[loc].Count;
                    lastAnswer = seq[loc][query[2] % size];
                    last.Add(lastAnswer);
                }
            }
            return last;

        }
        public static void Main(string[] args)
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            string[] firstMultipleInput = Console.ReadLine().TrimEnd().Split(' ');

            int n = Convert.ToInt32(firstMultipleInput[0]);

            int q = Convert.ToInt32(firstMultipleInput[1]);

            List<List<int>> queries = new List<List<int>>();

            for (int i = 0; i < q; i++)
            {
                queries.Add(Console.ReadLine().TrimEnd().Split(' ').ToList().Select(queriesTemp => Convert.ToInt32(queriesTemp)).ToList());
            }

            List<int> result = DynamicArray.dynamicArray(n, queries);
            Console.Write(result.ToString());
            //textWriter.WriteLine(String.Join("\n", result));

            //textWriter.Flush();
            //textWriter.Close();
        }
    }
}
