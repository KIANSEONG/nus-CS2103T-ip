package sus.commands;

import sus.storage.StorageFile;
import sus.task.TaskList;
import sus.ui.TextUi;

/**
 * Represents an executable command.
 */
public abstract class Command {

    /**
     * {@return true if the command executed is the exit command, false otherwise.}
     */
    public boolean isExit() {
        return this instanceof ExitCommand;
    }

    /**
     * Executes the command and returns the feedback to user.
     *
     * @param taskList task list manager
     * @param textUi manages Duke's interaction with the user
     * @param storage manages the storage of Duke's data
     */
    public abstract CommandResult execute(TaskList taskList, TextUi textUi, StorageFile storage);

}