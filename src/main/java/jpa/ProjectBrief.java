package jpa;

import javax.validation.constraints.NotNull;

/**
 * Class to map the attributes pid and title from the main class Project
 * Created by zemoso on 18/7/17.
 */
public class ProjectBrief {
    private long pid;
    private String title;

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProjectBrief(long pid, String title) {
        this.pid = pid;
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProjectBrief{");
        sb.append("pid=").append(pid);
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
