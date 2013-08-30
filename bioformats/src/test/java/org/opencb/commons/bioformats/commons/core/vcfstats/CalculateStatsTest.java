package org.opencb.commons.bioformats.commons.core.vcfstats;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.opencb.commons.bioformats.commons.core.connectors.variant.VcfDataReader;
import org.opencb.commons.bioformats.commons.core.connectors.variant.VcfDataWriter;
import org.opencb.commons.bioformats.commons.core.connectors.variant.VcfFileDataReader;
import org.opencb.commons.bioformats.commons.core.connectors.variant.VcfFileDataWriter;
import org.opencb.commons.bioformats.commons.core.feature.Pedigree;
import org.opencb.commons.bioformats.commons.core.variant.io.Vcf4Reader;
import org.opencb.commons.bioformats.commons.core.variant.vcf4.VcfRecord;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aaleman
 * Date: 8/26/13
 * Time: 1:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class CalculateStatsTest {

    private Long start, end;
    private Vcf4Reader vcf;
    private String vcfFileName = "/home/aaleman/tmp/small.vcf";
    private String pedFileName = "/home/aaleman/tmp/file.ped";
    private String pathStats   = "/home/aaleman/tmp/jstats/";


    @Rule
    public TestName name = new TestName();


    @Before
    public void setUp() throws Exception {
        start = System.currentTimeMillis();


    }

    @After
    public void tearDown() throws Exception {
        end = System.currentTimeMillis();
        System.out.println("Time " + name.getMethodName() + ": " + (end - start));

    }

    @Test
    public void testCalculateStatsList() throws Exception {

        VcfDataReader vcfReader = new VcfFileDataReader(vcfFileName);
        VcfDataWriter vcfWriter = new VcfFileDataWriter(pathStats);

        CalculateStats.runner(vcfReader, vcfWriter, pedFileName, pathStats);

    }



}
