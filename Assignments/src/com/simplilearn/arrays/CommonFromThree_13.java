package com.simplilearn.arrays;

public class CommonFromThree_13 {
			public static void main(String[] args) {
				int [] a1= {2,4,8,40};
				int [] a2= {2,3,4,8,10,16,40};
				int [] a3= {4,8,14,40};
				System.out.println("common element: ");
				for(int i=0;i<a1.length;i++) {
					for(int j=0;j<a2.length;j++) {
						for(int k=0;k<a3.length;k++) {
							if(a1[i]==a2[j] && a2[j]==a3[k]) {
								System.out.print(a1[i]+" ");
							}
						}
					}
				}
			}
		}

