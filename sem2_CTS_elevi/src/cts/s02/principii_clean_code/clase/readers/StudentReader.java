package cts.s02.principii_clean_code.clase.readers;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Elev;
import cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {
    @Override
    public List<Aplicant> citesteAplicant(String fileName) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(fileName));
        input2.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Student student=new Student();
            super.citesteAplicant(input2,student);
            int an = input2.nextInt();
            String facultate = input2.next();
            student.setFacultate(facultate);
            student.setAn_studii(an);
            studenti.add(student);
        }

        input2.close();
        return studenti;
    }
}