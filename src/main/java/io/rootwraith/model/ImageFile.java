package io.rootwraith.model;

public class ImageFile implements File {
	private String fileName;
	private final String fileType = "Image";
	private int fileSize;
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSize(int fileSize) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean checkFile(String fileName) {
		// TODO Auto-generated method stub
		return false;
	}

}
