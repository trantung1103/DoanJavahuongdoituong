package DoanHocKyJaVaHuongDoiTuong;
import java.io.*;
import java.util.ArrayList;
public class FileHocPhan {
	
			public void ghiFile(ArrayList<HocPhan> HocPhanList) {
		        FileOutputStream fout = null;
		        ObjectOutputStream oos = null;
		        try {

		 

		            fout = new FileOutputStream("e:\\hocphan.bin");
		            oos = new ObjectOutputStream(fout);
		            oos.writeObject(HocPhanList);

		 

		            System.out.println("Xong rồi!");
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        } finally {
		            if (fout != null) {
		                try {
		                    fout.close();
		                } catch (IOException e) {
		                    e.printStackTrace();
		                }
		            }

		 

		            if (oos != null) {
		                try {
		                    oos.close();
		                } catch (IOException e) {
		                    e.printStackTrace();
		                }
		            }
		        }
		    }
			public ArrayList<HocPhan> docFile(String filename) {

				 

		        ArrayList<HocPhan> DSHP = new ArrayList<>();

		 

		        FileInputStream fin = null;
		        ObjectInputStream ois = null;
		        try {
		            fin = new FileInputStream(filename);
		            ois = new ObjectInputStream(fin);
		           DSHP = (ArrayList<HocPhan>) ois.readObject();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        } finally {
		            if (fin != null) {
		                try {
		                    fin.close();
		                } catch (IOException e) {
		                    e.printStackTrace();
		                }
		            }

		 

		            if (ois != null) {
		                try {
		                    ois.close();
		                } catch (IOException e) {
		                    e.printStackTrace();
		                }
		            }

		 

		        }
		        return DSHP;
		    }
		}



