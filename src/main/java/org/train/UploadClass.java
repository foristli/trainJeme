package org.train;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadClass extends ActionSupport {
	private File image;
	private String imageContentType;
	private String imageFileName="test.txt";
	
	@Override
	public String execute()
	{
	
		String readPath="D:/work/file/";//ServletActionContext.getServletContext().getRealPath("/upload");
		File file=new File(readPath);
		if(!file.exists())file.mkdirs();
		try
		{
			int num=(int)(Math.random()*20000+1000);
			imageFileName=String.valueOf(num)+imageFileName;
			System.out.println(imageFileName);
			FileUtils.copyFile(image, new File(file,imageFileName));
		}
		catch(IOException e)
		{
			e.printStackTrace();
			this.addActionMessage("upload file fail");
			return this.ERROR;
		}
		return this.SUCCESS;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}
	
	
	
}
