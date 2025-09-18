//encapsulation in Java refers to integrating data (variables) and code (methods) into a single unit
package com.tnsif.encapsulation;

public class DemoStudent {
	 private int sid;
	    private String sname;
	     
	    public int getSid() {
	    	System.out.println("The student details are:");
			return sid;
		}


		public void setSid(int sid) {
			this.sid = sid;
		}


		public String getSname() {
			return sname;
		}


		public void setSname(String sname) {
			this.sname = sname;
		}


		public void display() {
	    	System.out.println("The student details are:"+sid +sname);
	    }

}
