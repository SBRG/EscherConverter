package edu.ucsd.sbrg.escher;

import org.junit.Test;
import org.sbml.jsbml.SBMLDocument;
import org.sbml.jsbml.SBMLReader;
import org.sbml.jsbml.ext.SBasePlugin;
import org.sbml.jsbml.ext.fbc.FBCConstants;
import org.sbml.jsbml.ext.fbc.FBCModelPlugin;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by devkhan on 28/07/16.
 */
public class CobraModelTest {

  @Test
  public void canExtractCobraModel() throws IOException, XMLStreamException {
//    SBMLDocument doc = SBMLReader.read(new File("data/MODEL_01186.sbml.xml"));
//    SBasePlugin obj = doc.getExtension(FBCConstants.shortLabel);
//    assertTrue("failure - fbc model extraction failed", obj != null);
    assertTrue("failure - cobra model extraction failed", EscherConverter.extractCobraModel(new File
        ("data/MODEL_01186.sbml.xml")));
  }
}
