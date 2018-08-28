package Logik;

import java.util.HashMap;

public class Dragon {

	private String stream;
	private int sizeStream;

	public Dragon(String stream) { 
		setStream(stream);
	}

	public String getStream() {
		String streamOut = new String();
		if (this.stream.equals("0")) {
			streamOut = "1";
			return streamOut;
		} else if (this.stream.equals("1")) {
			streamOut = "110";
			return streamOut;
		} else {
			String ende = "100";
			HashMap<String, String> map = new HashMap<>();
			String temp;

			map.put("11", "1101");
			map.put("01", "1001");
			map.put("10", "1100");
			map.put("00", "1000");
			int i = 0;

			while (i < sizeStream) {
				try {
					char a = stream.charAt(i);
					char b = stream.charAt(i + 1);
					if ((a != ' ') && (b != ' ')) {
						temp = new StringBuilder().append(a).append(b).toString();
						streamOut += map.get(temp);
					}

					i = i + 2;

				} catch (Exception e) {
					streamOut += ende;
					return streamOut;

				}

			}

		}

		return streamOut;

	}

	public void setStream(String stream) {
		this.stream = stream;
		this.sizeStream = this.stream.length();
	}

}
