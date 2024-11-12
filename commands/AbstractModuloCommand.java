package primenumberhashing.commands;

import primenumberhashing.UserInterface;
import primenumberhashing.Utilities;
import primenumberhashing.CSVReader;
import java.util.List;

abstract class AbstractModuloCommand {
    protected String goodKeysFilePath = "keys/GoodKeys.csv";
    protected String badKeysFilePath = "keys/BadKeys.csv";
    protected CSVReader csvReader = new CSVReader();
    protected UserInterface ui = new UserInterface();
    protected Utilities utils = new Utilities();
}