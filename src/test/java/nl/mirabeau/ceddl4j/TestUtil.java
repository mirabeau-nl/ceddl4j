package nl.mirabeau.ceddl4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class TestUtil {

	public String loadJsonFromFile(final String filename) {
		final StringBuilder sb = new StringBuilder();

		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(filename), "UTF-8"));
			for (int c = br.read(); c != -1; c = br.read()) {
				sb.append((char)c);
			}
		} catch (final UnsupportedEncodingException e) {
			throw new TestFailedException(e);
		} catch (final IOException e) {
			throw new TestFailedException("File not found ?", e);
		}
		return sb.toString();

	}
}