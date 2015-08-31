package com.project.transportMK.service.impl;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.project.transportMK.repository.RenameStationName;

@Repository
public class RenameStationNameImpl implements RenameStationName {

	@SuppressWarnings("serial")
	private HashMap<Character, String> alphaMap = new HashMap<Character, String>() {
		{
			put('а', "a");
			put('б', "b");
			put('в', "v");
			put('г', "g");
			put('д', "d");
			put('ѓ', "gj");
			put('е', "e");
			put('ж', "zh");
			put('з', "z");
			put('ѕ', "dz");
			put('и', "i");
			put('ј', "j");
			put('к', "k");
			put('л', "l");
			put('љ', "lj");
			put('м', "m");
			put('н', "n");
			put('њ', "nj");
			put('о', "o");
			put('п', "p");
			put('р', "r");
			put('с', "s");
			put('т', "t");
			put('ќ', "kj");
			put('у', "u");
			put('ф', "f");
			put('х', "h");
			put('ц', "c");
			put('џ', "dj");
			put('ш', "sh");
			put(' ', " ");
			put('А', "a");
			put('Б', "b");
			put('В', "v");
			put('Г', "g");
			put('Д', "d");
			put('Ѓ', "gj");
			put('Е', "e");
			put('Ж', "zh");
			put('З', "z");
			put('Ѕ', "dz");
			put('И', "i");
			put('Ј', "j");
			put('К', "k");
			put('Л', "l");
			put('Љ', "lj");
			put('М', "m");
			put('Н', "n");
			put('Њ', "nj");
			put('О', "o");
			put('П', "p");
			put('Р', "r");
			put('С', "s");
			put('Т', "t");
			put('Ќ', "kj");
			put('У', "u");
			put('Ф', "f");
			put('Х', "h");
			put('Ц', "c");
			put('Џ', "dj");
			put('Ш', "sh");
		}
	};

	@Override
	public String getRenamedField(String string) {
		StringBuilder sb = new StringBuilder();
		char[] charArray = string.toCharArray();
		for (char c : charArray) {
			sb.append(alphaMap.get(c));
		}
		return sb.toString();
	}

}
