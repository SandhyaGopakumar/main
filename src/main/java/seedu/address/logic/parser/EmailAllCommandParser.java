package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.util.logging.Level;
import java.util.logging.Logger;

import seedu.address.logic.commands.EmailAllCommand;
import seedu.address.logic.parser.exceptions.ParseException;

//@@author aaryamNUS
/**
 * Parses input arguments and creates a new EmailAllCommand object
 */
public class EmailAllCommandParser implements Parser<EmailAllCommand> {
    private static Logger logger = Logger.getLogger("parse");

    /**
     * Parses the given {@code String} of arguments in the context of the EmailAllCommand
     * and returns a EmailAllCommand object for execution. For this command, parser needs to
     * ensure that the arguments are null, i.e. no extra characters are inputted after the
     * command word EmailAll
     * @throws ParseException if the user input does not conform the expected format
     */
    public EmailAllCommand parse(String args) throws ParseException {
        //need to ensure that the arguments are indeed null

        if (args == null || args.replaceAll("\\s+", "").equals("")) {
            logger.log(Level.INFO, "EmailAllCommand arguments are null");
        } else {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                    EmailAllCommand.MESSAGE_USAGE));
        }

        return new EmailAllCommand();
    }
}
