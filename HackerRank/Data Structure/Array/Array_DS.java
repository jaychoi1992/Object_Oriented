����   9 a  Array_DS  java/lang/Object scanner Ljava/util/Scanner; <clinit> ()V Code  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
 
    <init> (Ljava/io/InputStream;)V	     LineNumberTable LocalVariableTable
     this 
LArray_DS; reverseArray ([I)[I a [I b i I StackMapTable ! main ([Ljava/lang/String;)V
 
 * + , nextInt ()I . (
|[
  ])?
 
 0 1 2 skip '(Ljava/lang/String;)Ljava/util/Scanner;
 
 4 5 6 nextLine ()Ljava/lang/String; 8  
 : < ; java/lang/String = > split '(Ljava/lang/String;)[Ljava/lang/String;
 @ B A java/lang/Integer C D parseInt (Ljava/lang/String;)I
  F  	  H I J out Ljava/io/PrintStream;
 L N M java/util/Arrays O P toString ([I)Ljava/lang/String;
 R T S java/io/PrintStream U V println (Ljava/lang/String;)V args [Ljava/lang/String; arrCount arr arrItems arrItem res X 
SourceFile Array_DS.java !                	   .      � 
Y� � � �                      	   /     *� �           	                 	   �     5*��
L=� &*�`d� "+**�`d.O+*�`d*.O�*����+�              
      *  3          5   !    0 " !   , # $  %    � 
 &"�  	 ' (  	   �     P� � )<� -� /W�
M� � 37� 9N6� -2� ?6,O����,� E:� G� K� Q�       .        !  #   & & ' / ( 5 & > + D , O /    H    P W X    I Y $   < Z !    0 [ X  #  # $  /  \ $  D  ] !  %    � &  ^ & ^    _    `