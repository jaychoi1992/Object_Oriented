����   9 b  SparseArray  java/lang/Object scanner Ljava/util/Scanner; <clinit> ()V Code  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
 
    <init> (Ljava/io/InputStream;)V	     LineNumberTable LocalVariableTable
     this LSparseArray; matchingStrings *([Ljava/lang/String;[Ljava/lang/String;)[I
 ! # " java/lang/String $ % equals (Ljava/lang/Object;)Z strings [Ljava/lang/String; queries idx I result [I query Ljava/lang/String; counter str StackMapTable ' , main ([Ljava/lang/String;)V 
Exceptions 8 java/io/IOException
 
 : ; < nextInt ()I > (
|[
  ])?
 
 @ A B skip '(Ljava/lang/String;)Ljava/util/Scanner;
 
 D E F nextLine ()Ljava/lang/String;
  H  	  J K L out Ljava/io/PrintStream;
 N P O java/util/Arrays Q R toString ([I)Ljava/lang/String;
 T V U java/io/PrintStream W X println (Ljava/lang/String;)V args stringsCount i stringsItem queriesCount queriesItem res 
SourceFile SparseArray.java !                	   .      � 
Y� � � �           !           	   /     *� �           	                 	  C     ]=+��
N+Y:�66� C2:6*Y:�66
� 
2:		�  � ��

���-�O����-�       .             2  <  ?  I  Q  [     H    ] & '     ] ( '   [ ) *   V + ,   6 - .   3 / *  2  0 . 	 1   R �   2 2 3  2  �   2 2 3 ! 2  2  �   2 2 3  2   	 4 5  6     7 	  T     w� � 9<� =� ?W� !M>� � � C:,S���� � 9>� =� ?W� !:6� � � C:S����,� G:� I� M� S�       F    &  '  )  +  , " - ' + / 0 6 1 ? 3 E 5 K 6 S 7 Z 5 c : k ; v I    f 
   w Y '    p Z *   b & '    [ *  "  \ .  6 A ] *  E 2 ( '  H  [ *  S  ^ .  k  _ ,  1    �  2�   2  `    a