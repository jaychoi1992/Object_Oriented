����   9 P  LeftRotation  java/lang/Object scanner Ljava/util/Scanner; <clinit> ()V Code  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
 
    <init> (Ljava/io/InputStream;)V	     LineNumberTable LocalVariableTable
     this LLeftRotation; main ([Ljava/lang/String;)V
 
 ! " # nextInt ()I	  % & ' out Ljava/io/PrintStream; ) java/lang/StringBuilder
 + - , java/lang/String . / valueOf (I)Ljava/lang/String;
 ( 1  2 (Ljava/lang/String;)V 4  
 ( 6 7 8 append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 ( : ; < toString ()Ljava/lang/String;
 > @ ? java/io/PrintStream A 2 print args [Ljava/lang/String; scan n I d array [I i StackMapTable C I 
SourceFile LeftRotation.java !                	   .      � 
Y� � � �           
           	   /     *� �           	             	    	       e� 
Y� � L+�  =+�  >�
:6� `dp+�  O����6� #� $� (Y.� *� 03� 5� 9� =���ݱ       .                /  8  >  [  d     H    e B C    Z D    U E F   P G F   K H I    J F  ; ) J F  K    �    L 
 M    N    O