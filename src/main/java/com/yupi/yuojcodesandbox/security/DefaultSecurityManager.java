package com.yupi.yuojcodesandbox.security;

import java.security.Permission;

public class DefaultSecurityManager extends SecurityManager{
    @Override
    public void checkExec(String cmd) {
        super.checkExec(cmd);
    }

    @Override
    public void checkRead(String file, Object context) {
        super.checkRead(file, context);
    }

    @Override
    public void checkWrite(String file) {
        super.checkWrite(file);
    }

    @Override
    public void checkDelete(String file) {
        super.checkDelete(file);
    }

    @Override
    public void checkConnect(String host, int port) {
        super.checkConnect(host, port);
    }

    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不做任何的权限限制");
        super.checkPermission(perm);
        throw new SecurityException("权限不足"+perm.getActions());
    }
}
